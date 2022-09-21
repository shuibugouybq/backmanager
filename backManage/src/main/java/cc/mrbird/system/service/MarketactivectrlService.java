package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.Marketactivectrl;

public interface MarketactivectrlService extends IService<Marketactivectrl> {

	List<Marketactivectrl> findAllMarketactivectrls(Marketactivectrl marketactivectrl);
	
	Marketactivectrl findById(Marketactivectrl marketactivectrl);
	
	void insertMarketactivectrl(Marketactivectrl marketactivectrl);
	
//	void updateMarketactivectrl(Marketactivectrl marketactivectrl);

	void deleteMarketactivectrl(Marketactivectrl marketactivectrl);
}
