package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelLimitCtrl;

public interface ChannelLimitCtrlService extends IService<ChannelLimitCtrl> {

	List<ChannelLimitCtrl> findAllChannelLimitCtrls(ChannelLimitCtrl channelLimitCtrl);
	
	ChannelLimitCtrl findById(ChannelLimitCtrl ChannelLimitCtrl);
	
	void addChannelLimitCtrl(ChannelLimitCtrl ChannelLimitCtrl);
	
	void updateChannelLimitCtrl(ChannelLimitCtrl ChannelLimitCtrl);

	void deleteChannelLimitCtrl(ChannelLimitCtrl ChannelLimitCtrl);
}
