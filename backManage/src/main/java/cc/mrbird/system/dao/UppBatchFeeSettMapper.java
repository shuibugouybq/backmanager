package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UppBatchFeeSett;

public interface UppBatchFeeSettMapper extends MyMapper<UppBatchFeeSett> {
	
	List<UppBatchFeeSett> transQuery(UppBatchFeeSett uppBatchFeeSett);
}