package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.InnerDeptManage;

public interface InnerDeptManageMapper extends MyMapper<InnerDeptManage> {
	
	void insertInnerDept(InnerDeptManage innerDeptManage);
	
	void updateInnerDept(InnerDeptManage innerDeptManage);
	
}