package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UserPayTypeSignInfo;

public interface UserPayTypeSignInfoService extends IService<UserPayTypeSignInfo>{

	List<UserPayTypeSignInfo> findAllUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo);

	void addUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo);

	void deleteUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo);

	void updateUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo);



}
