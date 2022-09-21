package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchDepartment;

public interface UppBatchDepartmentService extends IService<UppBatchDepartment>{



	List<UppBatchDepartment> findAllUppBatchDepartment(UppBatchDepartment uppBatchDepartment);

	void addUppBatchDepartment(UppBatchDepartment uppBatchDepartment);

	void deleteUppBatchDepartment(UppBatchDepartment uppBatchDepartment);

	void updateUppBatchDepartment(UppBatchDepartment uppBatchDepartment);



}
