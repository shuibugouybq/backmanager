package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UserTransctrl;

public interface UserTransctrlService extends IService<UserTransctrl> {

	List<UserTransctrl> findAllUserTransctrls(UserTransctrl userTransctrl);
	
	UserTransctrl findById(UserTransctrl userTransctrl);
	
	void updateUserTransctrl(UserTransctrl userTransctrl);

	void deleteUserTransctrl(UserTransctrl userTransctrl);
}
