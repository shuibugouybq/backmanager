package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchFeeTrans;

public interface UppBatchFeeTransService extends IService<UppBatchFeeTrans> {

	List<UppBatchFeeTrans> transQuery(UppBatchFeeTrans uppBatchFeeTrans);
}
