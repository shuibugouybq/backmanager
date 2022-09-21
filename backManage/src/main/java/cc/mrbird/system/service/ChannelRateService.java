package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelCtrlDayFractions;
import cc.mrbird.system.domain.ChannelItemScore;
import cc.mrbird.system.domain.ChannelLimitCtrl;
import cc.mrbird.system.domain.ChannelRate;

public interface ChannelRateService extends IService<ChannelRate>{

	List<ChannelRate> findAllChannelRate(ChannelRate channelRate);

	void addChannelRate(ChannelRate channelRate);

	void deleteChannelRate(ChannelRate channelRate);

	void updateChannelRate(ChannelRate channelRate);




}
