package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.SubOrderMapper;
import cc.mrbird.system.domain.SubOrder;
import cc.mrbird.system.service.SubOrderService;
@Service("SubOrdersService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class SubOrderServiceImpl extends BaseService<SubOrder> implements SubOrderService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private SubOrderMapper subOrder;
	
	public List<SubOrder> listQuery(SubOrder subOrder) {
		try {
			return this.subOrder.listQuery(subOrder);
		} catch (Exception e) {
			log.error("获取子订单信息列表失败", e);
            return new ArrayList<>();
		}
	}

}
