package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchCheckTransError;

public interface UppBatchCheckTransErrorService extends IService<UppBatchCheckTransError> {

	List<UppBatchCheckTransError> findAllUppBatchCheckTransErrors(UppBatchCheckTransError uppBatchCheckTransError);
	
	UppBatchCheckTransError findById(UppBatchCheckTransError uppBatchCheckTransError);
	
	void addUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError);
	
	void updateUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError);

	void deleteUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError);
	
	List<UppBatchCheckTransError> getCheckErrorCount(UppBatchCheckTransError upp);
}
