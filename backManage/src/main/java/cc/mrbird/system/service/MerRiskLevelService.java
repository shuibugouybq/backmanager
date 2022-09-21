package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.MerRiskLevel;

public interface MerRiskLevelService extends IService<MerRiskLevel> {

	List<MerRiskLevel> listQuery(MerRiskLevel merRiskLevel);
	
//	void addMerRiskLevel(MerRiskLevel merRiskLevel);
	
//	void updateMerRiskLevel(MerRiskLevel merRiskLevel);

//	void deleteMerRiskLevel(MerRiskLevel merRiskLevel);
}
