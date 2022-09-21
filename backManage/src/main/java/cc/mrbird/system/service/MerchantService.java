package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.Merchant;

public interface MerchantService extends IService<Merchant> {

	List<Merchant> findAllMerchants(Merchant merchant);
	
	Merchant findById(String merId);
	
	void addMerchant(Merchant merchant);
	
	void updateMerchant(Merchant merchant);

	void deleteMerchants(String merIds);
}
