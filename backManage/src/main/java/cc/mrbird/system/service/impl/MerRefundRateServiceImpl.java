package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.MerRefundRateMapper;
import cc.mrbird.system.domain.MerRefundRate;
import cc.mrbird.system.service.MerRefundRateService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("MerRefundRateService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MerRefundRateServiceImpl extends BaseService<MerRefundRate> implements MerRefundRateService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private MerRefundRateMapper merRefundRate;
	
	public List<MerRefundRate> merRefundRateQuery(MerRefundRate merRefundRate) {
		try {
			return this.merRefundRate.merRefundRateQuery(merRefundRate);
		} catch (Exception e) {
			log.error("获取商户退单率及笔数信息列表失败", e);
            return new ArrayList<>();
		}
	}

}
