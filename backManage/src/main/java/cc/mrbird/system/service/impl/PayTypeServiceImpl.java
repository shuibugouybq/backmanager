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
import cc.mrbird.system.domain.PayType;
import cc.mrbird.system.service.PayTypeService;
import tk.mybatis.mapper.entity.Example;
@Service("payTypeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class PayTypeServiceImpl extends BaseService<PayType> implements PayTypeService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<PayType> findAllPayType(PayType payType) {
		try {
			 Example example = new Example(PayType.class);
	         if (StringUtils.isNotBlank(payType.getPaytypcd())) {
					example.createCriteria().andLike("paytypcd", "%"+payType.getPaytypcd()+"%");
				}
//			example.setOrderByClause("PAYTYPCD");
          return this.selectByExample(example);
      } catch (Exception e) {
          log.error("产品基本信息表失败", e);
          return new ArrayList<>();
      }
	}

	@Override
	public void addPayType(PayType payType) {
		this.save(payType);
	}

	@Override
	public void deletePayType(PayType payType) {
		this.delete(payType);
	}

	@Override
	public void updatePayType(PayType payType) {
		this.updateNotNull(payType);
	}

	
	







}
