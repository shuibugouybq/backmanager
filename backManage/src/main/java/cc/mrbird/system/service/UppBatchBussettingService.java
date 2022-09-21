package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchBussetting;

public interface UppBatchBussettingService extends IService<UppBatchBussetting> {

	List<UppBatchBussetting> findAllUppBatchBussettings(UppBatchBussetting uppBatchBussetting);
	
	UppBatchBussetting findById(UppBatchBussetting uppBatchBussetting);
	
	void addUppBatchBussetting(UppBatchBussetting uppBatchBussetting);
	
	void updateUppBatchBussetting(UppBatchBussetting uppBatchBussetting);

	void deleteUppBatchBussetting(UppBatchBussetting uppBatchBussetting);
}
