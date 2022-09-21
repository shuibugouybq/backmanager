package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelCtrlDayFractions;

public interface ChannelCtrlDayfractService extends IService<ChannelCtrlDayFractions>{

	List<ChannelCtrlDayFractions> findAllChannelCtrlDayfract(ChannelCtrlDayFractions channelCtrlDayFractions);


}
