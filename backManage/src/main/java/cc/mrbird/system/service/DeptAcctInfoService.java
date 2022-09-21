package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.DeptAcctInfo;

public interface DeptAcctInfoService extends IService<DeptAcctInfo> {

	List<DeptAcctInfo> findAllDeptAcctInfos(DeptAcctInfo deptAcctInfo);
	
	DeptAcctInfo findById(DeptAcctInfo deptAcctInfo);
	
	void addDeptAcctInfo(DeptAcctInfo deptAcctInfo);
	
	void updateDeptAcctInfo(DeptAcctInfo deptAcctInfo);

	void deleteDeptAcctInfo(DeptAcctInfo deptAcctInfo);
}
