package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchMerTrans;

public interface UppBatchMerTransService extends IService<UppBatchMerTrans> {

	List<UppBatchMerTrans> transQuery(UppBatchMerTrans uppBatchMerTrans);
}
