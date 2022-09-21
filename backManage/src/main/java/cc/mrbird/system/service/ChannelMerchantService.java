package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelMerchant;

public interface ChannelMerchantService extends IService<ChannelMerchant> {

	List<ChannelMerchant> findAllChannelMerchants(ChannelMerchant channelMerchant);
	
	ChannelMerchant findById(ChannelMerchant channelMerchant);
	
	void addChannelMerchant(ChannelMerchant channelMerchant);
	
	void updateChannelMerchant(ChannelMerchant channelMerchant);

	void deleteChannelMerchant(ChannelMerchant channelMerchant);
}
