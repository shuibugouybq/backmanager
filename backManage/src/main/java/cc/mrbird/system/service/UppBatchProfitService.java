package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchProfit;

public interface UppBatchProfitService extends IService<UppBatchProfit> {

	List<UppBatchProfit> findAllUppBatchProfits(UppBatchProfit uppBatchProfit);
	
	UppBatchProfit findById(UppBatchProfit uppBatchProfit);
	
	void addUppBatchProfit(UppBatchProfit uppBatchProfit);
	
	void updateUppBatchProfit(UppBatchProfit uppBatchProfit);

	void deleteUppBatchProfit(UppBatchProfit uppBatchProfit);
}
