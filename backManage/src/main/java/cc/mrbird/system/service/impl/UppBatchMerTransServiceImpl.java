package cc.mrbird.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.UppBatchMerTransMapper;
import cc.mrbird.system.domain.UppBatchMerTrans;
import cc.mrbird.system.service.UppBatchMerTransService;
@Service("uppBatchMerTransService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchMerTransServiceImpl extends BaseService<UppBatchMerTrans> implements UppBatchMerTransService {
	@Autowired
    private UppBatchMerTransMapper uppBatchMerTransMapper;

	@Override
	public List<UppBatchMerTrans> transQuery(UppBatchMerTrans uppBatchMerTrans) {
		return this.uppBatchMerTransMapper.transQuery(uppBatchMerTrans);
	}

}
