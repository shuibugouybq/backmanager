package cc.mrbird.system.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.OtTransMapper;
import cc.mrbird.system.domain.OtTrans;
import cc.mrbird.system.service.TransQueryService;
@Service("transQueryService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class TransQueryServiceImpl extends BaseService<OtTrans> implements TransQueryService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
    private OtTransMapper otTransMapper;

	@Override
	public List<OtTrans> transQuery(OtTrans otTrans) {
		return this.otTransMapper.transQuery(otTrans);
	}

	@Override
	public List<OtTrans> getCusCount(OtTrans otTrans) {
		List<OtTrans>  list = this.otTransMapper.getCusCount(otTrans);
		return list.get(0) == null ? null : list;
	}


}
