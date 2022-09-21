package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.InnerDeptManageMapper;
import cc.mrbird.system.dao.MerRiskLevelMapper;
import cc.mrbird.system.domain.ChannelLimitCtrl;
import cc.mrbird.system.domain.InnerDeptManage;
import cc.mrbird.system.service.ChannelLimitCtrlService;
import cc.mrbird.system.service.InnerDeptManageService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("innerDeptManageService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class InnerDeptManageServiceImpl extends BaseService<InnerDeptManage> implements InnerDeptManageService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private InnerDeptManageMapper innerDeptManage;
	
	@Override
	@Transactional
	public List<InnerDeptManage> findAllInnerDeptManages(InnerDeptManage innerDeptManage) {
		try {
            Example example = new Example(InnerDeptManage.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(innerDeptManage.getDeptnbr())) {
            	criteria.andCondition("DEPTNBR=", innerDeptManage.getDeptnbr());
			}
            if(StringUtils.isNotBlank(innerDeptManage.getDeptname())) {
            	criteria.andCondition("DEPTNAME=", innerDeptManage.getDeptname());
            }
			example.setOrderByClause("DEPTNBR,DEPTNAME");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取机构信息列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public InnerDeptManage findById(InnerDeptManage innerDeptManage) {
		return this.selectByKey(innerDeptManage);
	}

	@Override
	@Transactional
	public void insertInnerDept(InnerDeptManage innerDeptManage) {
		this.innerDeptManage.insertInnerDept(innerDeptManage);
	}

	@Override
	@Transactional
	public void updateInnerDept(InnerDeptManage innerDeptManage) {
		this.innerDeptManage.updateInnerDept(innerDeptManage);
	}

	@Override
	@Transactional
	public void deleteInnerDeptManage(InnerDeptManage innerDeptManage) {
		this.delete(innerDeptManage);
	}

}
