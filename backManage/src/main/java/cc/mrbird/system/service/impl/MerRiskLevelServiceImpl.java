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
import cc.mrbird.system.dao.MerRiskLevelMapper;
import cc.mrbird.system.dao.OtTransMapper;
import cc.mrbird.system.domain.MerRiskLevel;
import cc.mrbird.system.domain.OtTrans;
import cc.mrbird.system.service.MerRiskLevelService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("MerRiskLevelsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MerRiskLevelServiceImpl extends BaseService<MerRiskLevel> implements MerRiskLevelService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private MerRiskLevelMapper merRiskLevel;
	
	public List<MerRiskLevel> listQuery(MerRiskLevel merRiskLevel) {
		try {
			return this.merRiskLevel.listQuery(merRiskLevel);
		} catch (Exception e) {
			log.error("获取商户风险等级信息列表失败", e);
            return new ArrayList<>();
		}
	}

}
