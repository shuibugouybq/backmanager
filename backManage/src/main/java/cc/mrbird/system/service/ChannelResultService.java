package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelResult;

public interface ChannelResultService extends IService<ChannelResult> {

	List<ChannelResult> findAllChannelResults(ChannelResult channelResult);
	
	ChannelResult findById(ChannelResult channelResult);
	
	void addChannelResult(ChannelResult channelResult);
	
	void updateChannelResult(ChannelResult channelResult);

	void deleteChannelResult(ChannelResult channelResult);
}
