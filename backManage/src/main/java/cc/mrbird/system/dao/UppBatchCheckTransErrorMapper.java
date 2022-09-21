package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UppBatchCheckTransError;

public interface UppBatchCheckTransErrorMapper extends MyMapper<UppBatchCheckTransError> {
	
	List<UppBatchCheckTransError> getCheckErrorCount(UppBatchCheckTransError uppBatchCheckTransError);
}