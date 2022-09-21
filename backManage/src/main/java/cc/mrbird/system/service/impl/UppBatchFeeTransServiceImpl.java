package cc.mrbird.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.UppBatchFeeTransMapper;
import cc.mrbird.system.domain.UppBatchFeeTrans;
import cc.mrbird.system.service.UppBatchFeeTransService;
@Service("uppBatchFeeTransService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchFeeTransServiceImpl extends BaseService<UppBatchFeeTrans> implements UppBatchFeeTransService {
	@Autowired
    private UppBatchFeeTransMapper uppBatchFeeTransMapper;

	@Override
	public List<UppBatchFeeTrans> transQuery(UppBatchFeeTrans uppBatchFeeTrans) {
		return this.uppBatchFeeTransMapper.transQuery(uppBatchFeeTrans);
	}

}
