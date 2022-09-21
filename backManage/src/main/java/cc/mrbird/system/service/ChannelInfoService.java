package cc.mrbird.system.service;

import java.util.List;
import java.util.Map;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelInfo;

public interface ChannelInfoService extends IService<ChannelInfo> {

	List<ChannelInfo> findAllChannelInfos(ChannelInfo channelInfo);
	
	ChannelInfo findById(ChannelInfo channelInfo);
	
	void addChannelInfo(ChannelInfo channelInfo);
	
	void updateChannelInfo(ChannelInfo channelInfo);

	void deleteChannelInfo(ChannelInfo channelInfo);
	
	Map<String,String> queryDicMap();
}
