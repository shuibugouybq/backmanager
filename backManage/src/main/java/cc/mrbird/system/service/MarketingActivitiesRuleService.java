package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.MarketingActivitiesRule;

public interface MarketingActivitiesRuleService extends IService<MarketingActivitiesRule> {

	List<MarketingActivitiesRule> findAllMarketingActivitiesRules(MarketingActivitiesRule marketingActivitiesRule);
	
	MarketingActivitiesRule findById(MarketingActivitiesRule marketingActivitiesRule);
	
	void insertMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule);
	
	void updateMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule);

	void deleteMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule);
}
