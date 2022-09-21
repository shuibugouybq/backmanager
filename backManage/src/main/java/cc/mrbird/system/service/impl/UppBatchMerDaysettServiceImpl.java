package cc.mrbird.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.UppBatchMerDaysettMapper;
import cc.mrbird.system.domain.UppBatchMerDaysett;
import cc.mrbird.system.service.UppBatchMerDaysettService;
@Service("uppBatchMerDaysettService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchMerDaysettServiceImpl extends BaseService<UppBatchMerDaysett> implements UppBatchMerDaysettService {
	@Autowired
    private UppBatchMerDaysettMapper uppBatchMerDaysettMapper;

	@Override
	public List<UppBatchMerDaysett> transQuery(UppBatchMerDaysett uppBatchMerDaysett) {
		return this.uppBatchMerDaysettMapper.transQuery(uppBatchMerDaysett);
	}

}
