package cc.mrbird.system.service;

import java.util.List;
import java.util.Map;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelBank;

public interface ChannelBankService extends IService<ChannelBank> {

	List<ChannelBank> findAllChannelBanks(ChannelBank channelBank);
	
	ChannelBank findById(ChannelBank channelBank);
	
	void addChannelBank(ChannelBank channelBank);
	
	void updateChannelBank(ChannelBank channelBank);

	void deleteChannelBank(ChannelBank channelBank);
	
	Map<String, String> getChannelBank();
}
