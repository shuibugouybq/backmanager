package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UppBatchFeeDaysett;

public interface UppBatchFeeDaysettMapper extends MyMapper<UppBatchFeeDaysett> {
	
	List<UppBatchFeeDaysett> transQuery(UppBatchFeeDaysett uppBatchFeeDaysett);
}