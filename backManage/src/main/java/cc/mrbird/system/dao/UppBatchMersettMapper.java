package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UppBatchMersett;

public interface UppBatchMersettMapper extends MyMapper<UppBatchMersett> {
	
	List<UppBatchMersett> transQuery(UppBatchMersett uppBatchMersett);
}