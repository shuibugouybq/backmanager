package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppMarketingOrder;

public interface UppMarketingOrderService extends IService<UppMarketingOrder> {

	List<UppMarketingOrder> transQuery(UppMarketingOrder uppMarketingOrder);
}
