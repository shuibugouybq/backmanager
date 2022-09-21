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
import cc.mrbird.system.domain.CardBin;
import cc.mrbird.system.service.CardBinService;
import tk.mybatis.mapper.entity.Example;
@Service("cardBinService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class CardBinServiceImpl extends BaseService<CardBin> implements CardBinService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<CardBin> findAllCardBins(CardBin cardbin) {
		try {
            Example example = new Example(CardBin.class);
            if (StringUtils.isNotBlank(cardbin.getCardBin())) {
				example.createCriteria().andLike("cardBin", "%"+cardbin.getCardBin()+"%");
			}
			example.setOrderByClause("BANK_ID,CARD_BIN");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取卡BIN列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public CardBin findById(CardBin cardbin) {
		return this.selectByKey(cardbin);
	}

	@Override
	@Transactional
	public void addCardBin(CardBin cardbin) {
		cardbin.setStatus("1");
		this.save(cardbin);
	}

	@Override
	@Transactional
	public void updateCardBin(CardBin cardbin) {
		this.updateNotNull(cardbin);
	}

	@Override
	@Transactional
	public void deleteCardBin(CardBin cardbin) {
		this.delete(cardbin);
	}

}
