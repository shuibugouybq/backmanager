package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.CustomerSign;

public interface CustomerSignService extends IService<CustomerSign> {
	
	List<CustomerSign> findAllCustomerSigns(CustomerSign customerSign);
	
	void updateCustomerSign(CustomerSign customerSign);

	void deleteCustomerSign(CustomerSign customerSign	);
}
