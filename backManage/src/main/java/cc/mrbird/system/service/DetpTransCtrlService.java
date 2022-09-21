package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.DetpTransCtrl;

public interface DetpTransCtrlService extends IService<DetpTransCtrl> {

	List<DetpTransCtrl> findAllDetpTransCtrls(DetpTransCtrl detpTransCtrl);
	
	DetpTransCtrl findById(DetpTransCtrl detpTransCtrl);
	
	void insertDetpTransCtrl(DetpTransCtrl detpTransCtrl);
	
	void updateDetpTransCtrl(DetpTransCtrl detpTransCtrl);

	void deleteDetpTransCtrl(DetpTransCtrl detpTransCtrl);
}
