package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UppBatchFeeTrans;

public interface UppBatchFeeTransMapper extends MyMapper<UppBatchFeeTrans> {
	
	List<UppBatchFeeTrans> transQuery(UppBatchFeeTrans uppBatchFeeTrans);
}