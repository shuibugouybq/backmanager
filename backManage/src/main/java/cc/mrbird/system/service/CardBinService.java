package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.CardBin;

public interface CardBinService extends IService<CardBin> {

	List<CardBin> findAllCardBins(CardBin cardbin);
	
	CardBin findById(CardBin cardbin);
	
	void addCardBin(CardBin cardbin);
	
	void updateCardBin(CardBin cardbin);

	void deleteCardBin(CardBin cardbin);
}
