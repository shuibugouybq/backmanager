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
import cc.mrbird.system.domain.ChannelMerchant;
import cc.mrbird.system.service.ChannelMerchantService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("channelMerchantService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelMerchantServiceImpl extends BaseService<ChannelMerchant> implements ChannelMerchantService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelMerchant> findAllChannelMerchants(ChannelMerchant channelMerchant) {
		try {
            Example example = new Example(ChannelMerchant.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(channelMerchant.getMerId())) {
            	criteria.andCondition("MER_ID=", channelMerchant.getMerId());
			}
            if (StringUtils.isNotBlank(channelMerchant.getBankId())) {
            	criteria.andCondition("BANK_ID=", channelMerchant.getBankId());
			}
			example.setOrderByClause("MER_ID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取通道信息列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public ChannelMerchant findById(ChannelMerchant channelMerchant) {
		return this.selectByKey(channelMerchant);
	}

	@Override
	@Transactional
	public void addChannelMerchant(ChannelMerchant channelMerchant) {
		this.save(channelMerchant);
	}

	@Override
	@Transactional
	public void updateChannelMerchant(ChannelMerchant channelMerchant) {
		this.updateNotNull(channelMerchant);	
	}

	@Override
	@Transactional
	public void deleteChannelMerchant(ChannelMerchant channelMerchant) {
		this.delete(channelMerchant);
	}


}
