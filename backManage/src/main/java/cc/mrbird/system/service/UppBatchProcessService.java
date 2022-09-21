package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchProcess;

public interface UppBatchProcessService extends IService<UppBatchProcess> {

	List<UppBatchProcess> findAllUppBatchProcesss(UppBatchProcess uppBatchProcess);
	
	UppBatchProcess findById(UppBatchProcess uppBatchProcess);
	
	void addUppBatchProcess(UppBatchProcess uppBatchProcess);
	
	void updateUppBatchProcess(UppBatchProcess uppBatchProcess);

	void deleteUppBatchProcess(UppBatchProcess uppBatchProcess);
}
