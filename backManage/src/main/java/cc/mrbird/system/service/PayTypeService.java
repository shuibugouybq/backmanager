package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ChannelCtrlDayFractions;
import cc.mrbird.system.domain.ChannelItemScore;
import cc.mrbird.system.domain.ChannelLimitCtrl;
import cc.mrbird.system.domain.ChannelRate;
import cc.mrbird.system.domain.PayType;

public interface PayTypeService extends IService<PayType>{

	List<PayType> findAllPayType(PayType payType);

	void addPayType(PayType payType);

	void deletePayType(PayType payType);

	void updatePayType(PayType payType);





}
