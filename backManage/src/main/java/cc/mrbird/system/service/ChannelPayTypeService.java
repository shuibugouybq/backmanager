package cc.mrbird.system.service;



import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelPayType;

public interface ChannelPayTypeService extends IService<ChannelPayType>{

	List<ChannelPayType> findAllChannelPayType(ChannelPayType channelPayType);

	void deleteChannelPayType(ChannelPayType channelPayType);

	void updateChannelPayType(ChannelPayType channelPayType);

	void addChannelPayType(ChannelPayType channelPayType);







}
