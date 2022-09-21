package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UppBatchMerTrans;

public interface UppBatchMerTransMapper extends MyMapper<UppBatchMerTrans> {
	
	List<UppBatchMerTrans> transQuery(UppBatchMerTrans uppBatchMerTrans);
}