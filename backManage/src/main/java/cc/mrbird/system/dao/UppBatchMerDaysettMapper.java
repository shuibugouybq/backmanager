package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UppBatchMerDaysett;

public interface UppBatchMerDaysettMapper extends MyMapper<UppBatchMerDaysett> {
	
	List<UppBatchMerDaysett> transQuery(UppBatchMerDaysett uppBatchMerDaysett);
}