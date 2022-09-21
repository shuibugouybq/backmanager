package cc.mrbird.system.dao;


import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.Marketactivectrl;

public interface MarketactivectrlMapper extends MyMapper<Marketactivectrl> {
	
//	void insertInnerDept(InnerDeptManage innerDeptManage);
	
//	void updateInnerDept(InnerDeptManage innerDeptManage);
	
	void deleteByAllCondition(Marketactivectrl marketactivectrl);
	
}