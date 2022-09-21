package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.MerRiskLevel;
import cc.mrbird.system.domain.UppBatchHostTrans;

public interface UppBatchHostTransMapper extends MyMapper<UppBatchHostTrans> {
	
	List<UppBatchHostTrans> listQuery(UppBatchHostTrans uppBatchHostTrans);
	
}