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
import cc.mrbird.system.domain.UppBatchProfit;
import cc.mrbird.system.service.UppBatchProfitService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("uppBatchProfitService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchProfitServiceImpl extends BaseService<UppBatchProfit> implements UppBatchProfitService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<UppBatchProfit> findAllUppBatchProfits(UppBatchProfit uppBatchProfit) {
		try {
            Example example = new Example(UppBatchProfit.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(uppBatchProfit.getProfitSeqno())) {
            	criteria.andCondition("PROFIT_SEQNO=", uppBatchProfit.getProfitSeqno());
			}
            if (StringUtils.isNotBlank(uppBatchProfit.getProfitOrder())) {
            	criteria.andCondition("PROFIT_ORDER=", uppBatchProfit.getProfitOrder());
			}
			example.setOrderByClause("PROFIT_SEQNO,PROFIT_ORDER");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取分润比例列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public UppBatchProfit findById(UppBatchProfit uppBatchProfit) {
		return this.selectByKey(uppBatchProfit);
	}

	@Override
	@Transactional
	public void addUppBatchProfit(UppBatchProfit uppBatchProfit) {
		this.save(uppBatchProfit);
	}

	@Override
	@Transactional
	public void updateUppBatchProfit(UppBatchProfit uppBatchProfit) {
		this.updateNotNull(uppBatchProfit);	
	}

	@Override
	@Transactional
	public void deleteUppBatchProfit(UppBatchProfit uppBatchProfit) {
		this.delete(uppBatchProfit);
	}


}
