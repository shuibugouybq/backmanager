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
import cc.mrbird.system.domain.ChannelBankSupport;
import cc.mrbird.system.service.ChannelBankSupportService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("channelBankSupportService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelBankSupportServiceImpl extends BaseService<ChannelBankSupport> implements ChannelBankSupportService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelBankSupport> findAllChannelBankSupports(ChannelBankSupport channelBankSupport) {
		try {
            Example example = new Example(ChannelBankSupport.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(channelBankSupport.getBankId())) {
            	criteria.andCondition("BANK_ID=", channelBankSupport.getBankId());
			}
            if (StringUtils.isNotBlank(channelBankSupport.getChannelId())) {
            	criteria.andCondition("CHANNEL_ID=", channelBankSupport.getChannelId());
			}
            if (StringUtils.isNotBlank(channelBankSupport.getChannelType())) {
            	criteria.andCondition("CHANNEL_TYPE=", channelBankSupport.getChannelType());
			}
			example.setOrderByClause("BANK_ID,CHANNEL_ID,CHANNEL_TYPE");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取通道支持银行列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public ChannelBankSupport findById(ChannelBankSupport channelBankSupport) {
		return this.selectByKey(channelBankSupport);
	}

	@Override
	@Transactional
	public void addChannelBankSupport(ChannelBankSupport channelBankSupport) {
		this.save(channelBankSupport);
	}

	@Override
	@Transactional
	public void updateChannelBankSupport(ChannelBankSupport channelBankSupport) {
		this.updateNotNull(channelBankSupport);	
	}

	@Override
	@Transactional
	public void deleteChannelBankSupport(ChannelBankSupport channelBankSupport) {
		this.delete(channelBankSupport);
	}


}
