package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelCtrlFractions;

public interface ChannelCtrlFractionsService extends IService<ChannelCtrlFractions> {

	List<ChannelCtrlFractions> transQuery(ChannelCtrlFractions channelCtrlFractions);
}
