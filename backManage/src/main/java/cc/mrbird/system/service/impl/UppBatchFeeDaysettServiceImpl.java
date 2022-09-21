package cc.mrbird.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.UppBatchFeeDaysettMapper;
import cc.mrbird.system.domain.UppBatchFeeDaysett;
import cc.mrbird.system.service.UppBatchFeeDaysettService;
@Service("uppBatchFeeDaysettService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchFeeDaysettServiceImpl extends BaseService<UppBatchFeeDaysett> implements UppBatchFeeDaysettService {
	@Autowired
    private UppBatchFeeDaysettMapper uppBatchFeeDaysettMapper;

	@Override
	public List<UppBatchFeeDaysett> transQuery(UppBatchFeeDaysett uppBatchFeeDaysett) {
		return this.uppBatchFeeDaysettMapper.transQuery(uppBatchFeeDaysett);
	}

}
