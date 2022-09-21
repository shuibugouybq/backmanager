package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.MerTransLimit;
import cc.mrbird.system.service.MerTransLimitService;
import tk.mybatis.mapper.entity.Example;
@Service("merTransLimitService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MerTransLimitServiceImpl extends BaseService<MerTransLimit> implements MerTransLimitService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<MerTransLimit> findAllMerTransLimit(MerTransLimit merTransLimit) {
		try {
			 Example example = new Example(MerTransLimit.class);
	         if (StringUtils.isNotBlank(merTransLimit.getPaytypcd())) {
					example.createCriteria().andLike("paytypcd", "%"+merTransLimit.getPaytypcd()+"%");
				}
//			example.setOrderByClause("BANK_ID,CARD_BIN");
         return this.selectByExample(example);
     } catch (Exception e) {
         log.error("商户交易控制失败", e);
         return new ArrayList<>();
     }
	}

	@Override
	@Transactional
	public void addMerTransLimit(MerTransLimit merTransLimit) {
		this.save(merTransLimit);
	}

	@Override
	@Transactional
	public void deleteMerTransLimit(MerTransLimit merTransLimit) {
		this.delete(merTransLimit);
		
	}

	@Override
	@Transactional
	public void updateMerTransLimit(MerTransLimit merTransLimit) {
		this.updateNotNull(merTransLimit);		
	}





}
