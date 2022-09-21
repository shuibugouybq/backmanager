package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.DeptAcctInfo;
import cc.mrbird.system.service.DeptAcctInfoService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("deptAcctInfoService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DeptAcctInfoServiceImpl extends BaseService<DeptAcctInfo> implements DeptAcctInfoService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<DeptAcctInfo> findAllDeptAcctInfos(DeptAcctInfo deptAcctInfo) {
		try {
            Example example = new Example(DeptAcctInfo.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(deptAcctInfo.getDeptnbr())) {
            	criteria.andCondition("DEPTNBR=", deptAcctInfo.getDeptnbr());
			}
            if (StringUtils.isNotBlank(deptAcctInfo.getAcctnbr())) {
            	criteria.andCondition("ACCTNBR=", deptAcctInfo.getAcctnbr());
			}
            if (StringUtils.isNotBlank(deptAcctInfo.getAcctdeptnbr())) {
            	criteria.andCondition("ACCTDEPTNBR=", deptAcctInfo.getAcctdeptnbr());
			}
			example.setOrderByClause("DEPTNBR,INNERACCTCFMMODE");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取机构账户列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public DeptAcctInfo findById(DeptAcctInfo deptAcctInfo) {
		return this.selectByKey(deptAcctInfo);
	}

	@Override
	@Transactional
	public void addDeptAcctInfo(DeptAcctInfo deptAcctInfo) {
		this.save(deptAcctInfo);
	}

	@Override
	@Transactional
	public void updateDeptAcctInfo(DeptAcctInfo deptAcctInfo) {
		this.updateNotNull(deptAcctInfo);	
	}

	@Override
	@Transactional
	public void deleteDeptAcctInfo(DeptAcctInfo deptAcctInfo) {
		this.delete(deptAcctInfo);
	}


}
