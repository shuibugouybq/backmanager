package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchMersett;

public interface UppBatchMersettService extends IService<UppBatchMersett> {

	List<UppBatchMersett> transQuery(UppBatchMersett uppBatchMersett);
}
