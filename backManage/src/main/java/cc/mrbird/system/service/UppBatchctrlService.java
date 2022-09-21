package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchctrl;

public interface UppBatchctrlService extends IService<UppBatchctrl>{


	List<UppBatchctrl> findAlluppBatchctrl(UppBatchctrl uppBatchctrl);

	void addUppBatchctrl(UppBatchctrl uppBatchctrl);

	void updateUppBatchctrl(UppBatchctrl uppBatchctrl);

	void deleteUppBatchctrl(UppBatchctrl uppBatchctrl);



}
