package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.MerAccumulatedAmount;

public interface MerAccumulatedAmountService extends IService<MerAccumulatedAmount> {

	List<MerAccumulatedAmount> transQuery(MerAccumulatedAmount merAccumulatedAmount);
}
