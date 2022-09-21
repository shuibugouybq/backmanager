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
import cc.mrbird.system.dao.UppBatchHostTransMapper;
import cc.mrbird.system.domain.UppBatchHostTrans;
import cc.mrbird.system.service.UppBatchHostTransService;
@Service("UppBatchHostTranssService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchHostTransServiceImpl extends BaseService<UppBatchHostTrans> implements UppBatchHostTransService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private UppBatchHostTransMapper uppBatchHostTrans;
	
	public List<UppBatchHostTrans> listQuery(UppBatchHostTrans uppBatchHostTrans) {
		try {
			return this.uppBatchHostTrans.listQuery(uppBatchHostTrans);
		} catch (Exception e) {
			log.error("获取对账核心提取信息列表失败", e);
            return new ArrayList<>();
		}
	}

}
