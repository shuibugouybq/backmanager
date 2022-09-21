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
import cc.mrbird.system.dao.MarketactivectrlMapper;
import cc.mrbird.system.domain.Marketactivectrl;
import cc.mrbird.system.service.MarketactivectrlService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("marketactivectrlService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MarketactivectrlServiceImpl extends BaseService<Marketactivectrl> implements MarketactivectrlService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private MarketactivectrlMapper marketactivectrl;
	
	@Override
	@Transactional
	public List<Marketactivectrl> findAllMarketactivectrls(Marketactivectrl marketactivectrl) {
		try {
            Example example = new Example(Marketactivectrl.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(marketactivectrl.getMarketActiveID())) {
            	criteria.andCondition("MARKETACTIVEID=", marketactivectrl.getMarketActiveID());
			}
            if(StringUtils.isNotBlank(marketactivectrl.getUserCardTypCd())) {
            	criteria.andCondition("USERCARDTYPCD=", marketactivectrl.getUserCardTypCd());
            }
            if(StringUtils.isNotBlank(marketactivectrl.getCardRank())) {
            	criteria.andCondition("CARDRANK=", marketactivectrl.getCardRank());
            }
            if(StringUtils.isNotBlank(marketactivectrl.getPayProduct())) {
            	criteria.andCondition("PAYPRODUCT=", marketactivectrl.getPayProduct());
            }
            if(StringUtils.isNotBlank(marketactivectrl.getChannelNBR())) {
            	criteria.andCondition("CHANNELNBR=", marketactivectrl.getChannelNBR());
            }
			example.setOrderByClause("MARKETACTIVEID,USERCARDTYPCD,CARDRANK,PAYPRODUCT,CHANNELNBR");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取机构信息列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public Marketactivectrl findById(Marketactivectrl marketactivectrl) {
		return this.selectByKey(marketactivectrl);
	}

	@Override
	@Transactional
	public void insertMarketactivectrl(Marketactivectrl marketactivectrl) {
		this.save(marketactivectrl);
	}

	/*@Override
	@Transactional
	public void updateMarketactivectrl(Marketactivectrl marketactivectrl) {
		this.marketactivectrl.updateInnerDept(marketactivectrl);
	}*/

	@Override
	@Transactional
	public void deleteMarketactivectrl(Marketactivectrl marketactivectrl) {
		this.marketactivectrl.deleteByAllCondition(marketactivectrl);
	}

}
