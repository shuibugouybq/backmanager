package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UserBlackWhiteList;

public interface UserBlackWhiteListService extends IService<UserBlackWhiteList> {

	List<UserBlackWhiteList> findAllUserBlackWhiteLists(UserBlackWhiteList userBlackWhiteList);
	
	UserBlackWhiteList findById(UserBlackWhiteList userBlackWhiteList);
	
	void addUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList);
	
	void updateUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList);

	void deleteUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList);
}
