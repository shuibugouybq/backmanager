package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchFeeSett;

public interface UppBatchFeeSettService extends IService<UppBatchFeeSett> {

	List<UppBatchFeeSett> transQuery(UppBatchFeeSett uppBatchFeeSett);
}
