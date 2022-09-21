package cc.mrbird.system.dao;


import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.DetpTransCtrl;

public interface DetpTransCtrlMapper extends MyMapper<DetpTransCtrl> {
	
	List<DetpTransCtrl> listQuery(DetpTransCtrl detpTransCtrl);
	
	DetpTransCtrl findById(DetpTransCtrl detpTransCtrl);
	
	void insertDetpTransCtrl(DetpTransCtrl detpTransCtrl);
	
	void updateDetpTransCtrl(DetpTransCtrl detpTransCtrl);
	
	void deleteDetpTransCtrl(DetpTransCtrl detpTransCtrl);
	
}