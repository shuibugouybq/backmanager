package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchFeeDaysett;

public interface UppBatchFeeDaysettService extends IService<UppBatchFeeDaysett> {

	List<UppBatchFeeDaysett> transQuery(UppBatchFeeDaysett uppBatchFeeDaysett);
}
