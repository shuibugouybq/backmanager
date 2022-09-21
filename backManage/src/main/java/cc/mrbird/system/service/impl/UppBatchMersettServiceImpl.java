package cc.mrbird.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.UppBatchMersettMapper;
import cc.mrbird.system.domain.UppBatchMersett;
import cc.mrbird.system.service.UppBatchMersettService;
@Service("uppBatchMersettService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchMersettServiceImpl extends BaseService<UppBatchMersett> implements UppBatchMersettService {
	@Autowired
    private UppBatchMersettMapper uppBatchMersettMapper;

	@Override
	public List<UppBatchMersett> transQuery(UppBatchMersett uppBatchMersett) {
		return this.uppBatchMersettMapper.transQuery(uppBatchMersett);
	}

}
