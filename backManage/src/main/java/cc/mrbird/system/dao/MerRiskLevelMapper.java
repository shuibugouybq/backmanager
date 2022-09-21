package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.MerRiskLevel;

public interface MerRiskLevelMapper extends MyMapper<MerRiskLevel> {
	
	List<MerRiskLevel> listQuery(MerRiskLevel merRiskLevel);
	
}