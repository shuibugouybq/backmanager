package cc.mrbird.system.service;


import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelLimitFractions;

public interface ChannelLimitFractionsService extends IService<ChannelLimitFractions>{

	List<ChannelLimitFractions> findAllChannelLimitFractions(ChannelLimitFractions channelLimitFractions);

	void addChannelLimitFractions(ChannelLimitFractions channelLimitFractions);

	void updateChannelLimitFractions(ChannelLimitFractions channelLimitFractions);

	void deleteChannelLimitFractions(ChannelLimitFractions channelLimitFractions);






}
