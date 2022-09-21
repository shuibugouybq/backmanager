package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.MerRefundRate;

public interface MerRefundRateService extends IService<MerRefundRate> {

	List<MerRefundRate> merRefundRateQuery(MerRefundRate merRefundRate);
	
//	void addMerRiskLevel(MerRiskLevel merRiskLevel);
	
//	void updateMerRiskLevel(MerRiskLevel merRiskLevel);

//	void deleteMerRiskLevel(MerRiskLevel merRiskLevel);
}
