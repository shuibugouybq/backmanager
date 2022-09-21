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
import cc.mrbird.system.domain.Agency;
import cc.mrbird.system.service.AgencyService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("agencyService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class AgencyServiceImpl extends BaseService<Agency> implements AgencyService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<Agency> findAllAgencys(Agency agency) {
		try {
            Example example = new Example(Agency.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(agency.getAgencynbr())) {
            	criteria.andCondition("AGENCYNBR=", agency.getAgencynbr());
			}
			example.setOrderByClause("AGENCYNBR");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取代理商列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public Agency findById(Agency agency) {
		return this.selectByKey(agency);
	}

	@Override
	@Transactional
	public void addAgency(Agency agency) {
		this.save(agency);
	}

	@Override
	@Transactional
	public void updateAgency(Agency agency) {
		this.updateNotNull(agency);	
	}

	@Override
	@Transactional
	public void deleteAgency(Agency agency) {
		this.delete(agency);
	}


}
