package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchMerDaysett;

public interface UppBatchMerDaysettService extends IService<UppBatchMerDaysett> {

	List<UppBatchMerDaysett> transQuery(UppBatchMerDaysett uppBatchMerDaysett);
}
