package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.ItemWeightSupport;

public interface ItemWeightSupportService extends IService<ItemWeightSupport> {
	
	
	List<ItemWeightSupport> findAllItemWeightSupport(ItemWeightSupport itemWeightSupport);
		
	ItemWeightSupport findById(ItemWeightSupport itemWeightSupport);

	void addItemWeightSupport(ItemWeightSupport itemWeightSupport);
	
	void updateItemWeightSupport(ItemWeightSupport itemWeightSupport);

	void deleteItemWeightSupport(ItemWeightSupport itemWeightSupport);
}
