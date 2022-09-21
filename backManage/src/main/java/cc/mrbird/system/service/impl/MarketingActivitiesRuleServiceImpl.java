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
import cc.mrbird.system.domain.MarketingActivitiesRule;
import cc.mrbird.system.service.MarketingActivitiesRuleService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("marketingActivitiesRuleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MarketingActivitiesRuleServiceImpl extends BaseService<MarketingActivitiesRule> implements MarketingActivitiesRuleService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

//	@Autowired
//    private MarketingActivitiesRuleMapper marketingActivitiesRule;
	
	@Override
	@Transactional
	public List<MarketingActivitiesRule> findAllMarketingActivitiesRules(MarketingActivitiesRule marketingActivitiesRule) {
		try {
            Example example = new Example(MarketingActivitiesRule.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(marketingActivitiesRule.getMarketActiveID())) {
            	criteria.andCondition("MARKETACTIVEID=", marketingActivitiesRule.getMarketActiveID());
			}
            if (StringUtils.isNotBlank(marketingActivitiesRule.getMerNBR())) {
            	criteria.andCondition("MERNBR=", marketingActivitiesRule.getMerNBR());
			}
            if (StringUtils.isNotBlank(marketingActivitiesRule.getMarketActiveType())) {
            	criteria.andCondition("MARKETACTIVETYPE=", marketingActivitiesRule.getMarketActiveType());
			}
            if (StringUtils.isNotBlank(marketingActivitiesRule.getMarketActivesStartDate())) {
            	criteria.andCondition("MARKETACTIVESTARTDATE>=", marketingActivitiesRule.getMarketActivesStartDate());
			}
            if (StringUtils.isNotBlank(marketingActivitiesRule.getMarketActivesEndDate())) {
            	criteria.andCondition("MARKETACTIVEENDDATE<=", marketingActivitiesRule.getMarketActivesEndDate());
			}
            
			example.setOrderByClause("MARKETACTIVEID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取营销管理信息列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public MarketingActivitiesRule findById(MarketingActivitiesRule marketingActivitiesRule) {
		return this.selectByKey(marketingActivitiesRule);
	}

	@Override
	@Transactional
	public void insertMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule) {
		this.save(marketingActivitiesRule);
	}

	@Override
	@Transactional
	public void updateMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule) {
		this.updateNotNull(marketingActivitiesRule);
	}

	@Override
	@Transactional
	public void deleteMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule) {
		this.delete(marketingActivitiesRule);
	}

}
