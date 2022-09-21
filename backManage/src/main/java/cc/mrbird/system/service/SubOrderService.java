package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.SubOrder;
import cc.mrbird.system.domain.UppBatchHostTrans;

public interface SubOrderService extends IService<SubOrder> {

	List<SubOrder> listQuery(SubOrder subOrder);
	
}
