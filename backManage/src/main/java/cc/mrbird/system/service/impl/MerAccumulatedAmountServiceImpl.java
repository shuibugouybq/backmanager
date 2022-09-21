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
import cc.mrbird.system.domain.MerAccumulatedAmount;
import cc.mrbird.system.service.MerAccumulatedAmountService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("merAccumulatedAmountService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MerAccumulatedAmountServiceImpl extends BaseService<MerAccumulatedAmount> implements MerAccumulatedAmountService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<MerAccumulatedAmount> transQuery(MerAccumulatedAmount merAccumulatedAmount) {
		try {
            Example example = new Example(ChannelResult.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(merAccumulatedAmount.getMerId())) {
            	criteria.andCondition("Mer_id=", merAccumulatedAmount.getMerId());
			}
            if (StringUtils.isNotBlank(merAccumulatedAmount.getMerSetdate())) {
            	criteria.andCondition("date_format(TRANS_DATE,'%Y-%m-%d') >=", merAccumulatedAmount.getMerSetdate());
            }
            if (StringUtils.isNotBlank(merAccumulatedAmount.getMerSetdate())) {
            	criteria.andCondition("date_format(TRANS_DATE,'%Y-%m-%d') <=", merAccumulatedAmount.getMerSetdate());
            }
			example.setOrderByClause("mer_setDate DESC,Mer_id");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取商户累计金额列表失败", e);
            return new ArrayList<>();
        }
	}

}
