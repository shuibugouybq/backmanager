package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelCtrlDayFractions;
import cc.mrbird.system.domain.ChannelItemScore;

public interface ChannelItemScoreService extends IService<ChannelItemScore>{

	List<ChannelItemScore> findAllChannelItemScores(ChannelItemScore channelItemScore);

	void addChannelItemScore(ChannelItemScore channelItemScore);

	void updateChannelItemScore(ChannelItemScore channelItemScore);

	void deleteChannelItemScore(ChannelItemScore channelItemScore);



}
