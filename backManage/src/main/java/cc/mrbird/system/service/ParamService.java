package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.Param;

public interface ParamService extends IService<Param> {

	List<Param> findAllParams(Param param);
	
	Param findById(Param param);
	
	void addParam(Param param);
	
	void updateParam(Param param);

	void deleteParam(String ids);
}
