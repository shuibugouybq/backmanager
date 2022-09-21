package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelBankSupport;

public interface ChannelBankSupportService extends IService<ChannelBankSupport> {

	List<ChannelBankSupport> findAllChannelBankSupports(ChannelBankSupport channelBankSupport);
	
	ChannelBankSupport findById(ChannelBankSupport channelBankSupport);
	
	void addChannelBankSupport(ChannelBankSupport channelBankSupport);
	
	void updateChannelBankSupport(ChannelBankSupport channelBankSupport);

	void deleteChannelBankSupport(ChannelBankSupport channelBankSupport);
}
