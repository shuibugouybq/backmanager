package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.InnerDeptManage;

public interface InnerDeptManageService extends IService<InnerDeptManage> {

	List<InnerDeptManage> findAllInnerDeptManages(InnerDeptManage innerDeptManage);
	
	InnerDeptManage findById(InnerDeptManage innerDeptManage);
	
	void insertInnerDept(InnerDeptManage innerDeptManage);
	
	void updateInnerDept(InnerDeptManage innerDeptManage);

	void deleteInnerDeptManage(InnerDeptManage innerDeptManage);
}
