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
import cc.mrbird.system.domain.ChannelResult;
import cc.mrbird.system.domain.UppMarketingOrder;
import cc.mrbird.system.service.UppMarketingOrderService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("uppMarketingOrderService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppMarketingOrderServiceImpl extends BaseService<UppMarketingOrder> implements UppMarketingOrderService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<UppMarketingOrder> transQuery(UppMarketingOrder uppMarketingOrder) {
		try {
            Example example = new Example(ChannelResult.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(uppMarketingOrder.getTransSeqno())) {
            	criteria.andCondition("transSeqno=", uppMarketingOrder.getTransSeqno());
			}
            if (StringUtils.isNotBlank(uppMarketingOrder.getBeginDate())) {
            	criteria.andCondition("date_format(TRANS_DATE,'%Y-%m-%d') >=", uppMarketingOrder.getBeginDate());
            }
            if (StringUtils.isNotBlank(uppMarketingOrder.getEndDate())) {
            	criteria.andCondition("date_format(TRANS_DATE,'%Y-%m-%d') <=", uppMarketingOrder.getEndDate());
            }
			example.setOrderByClause("transSeqno DESC");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取营销订单列表失败", e);
            return new ArrayList<>();
        }
	}

}
