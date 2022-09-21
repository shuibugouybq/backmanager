package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.MerUserPayTypeSign;

public interface MerUserPayTypeSignService extends IService<MerUserPayTypeSign>{

	List<MerUserPayTypeSign> findAllMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign);

	MerUserPayTypeSign findById(MerUserPayTypeSign merUserPayTypeSign);
	
	void addMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign);
	
	void updateMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign);

	void deleteMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign);

}
