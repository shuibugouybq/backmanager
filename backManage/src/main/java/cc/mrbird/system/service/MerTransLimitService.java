package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelCtrlDayFractions;
import cc.mrbird.system.domain.ChannelItemScore;
import cc.mrbird.system.domain.MerTransLimit;

public interface MerTransLimitService extends IService<MerTransLimit>{


	List<MerTransLimit> findAllMerTransLimit(MerTransLimit merTransLimit);

	void addMerTransLimit(MerTransLimit merTransLimit);

	void deleteMerTransLimit(MerTransLimit merTransLimit);

	void updateMerTransLimit(MerTransLimit merTransLimit);



}
