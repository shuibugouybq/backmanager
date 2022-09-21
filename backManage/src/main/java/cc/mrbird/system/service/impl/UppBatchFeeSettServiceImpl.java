package cc.mrbird.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.UppBatchFeeSettMapper;
import cc.mrbird.system.domain.UppBatchFeeSett;
import cc.mrbird.system.service.UppBatchFeeSettService;
@Service("uppBatchFeeSettService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchFeeSettServiceImpl extends BaseService<UppBatchFeeSett> implements UppBatchFeeSettService {
	@Autowired
    private UppBatchFeeSettMapper uppBatchFeeSettMapper;

	@Override
	public List<UppBatchFeeSett> transQuery(UppBatchFeeSett uppBatchFeeSett) {
		return this.uppBatchFeeSettMapper.transQuery(uppBatchFeeSett);
	}

}
