package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.Agency;

public interface AgencyService extends IService<Agency> {

	List<Agency> findAllAgencys(Agency agency);
	
	Agency findById(Agency agency);
	
	void addAgency(Agency agency);
	
	void updateAgency(Agency agency);

	void deleteAgency(Agency agency);
}
