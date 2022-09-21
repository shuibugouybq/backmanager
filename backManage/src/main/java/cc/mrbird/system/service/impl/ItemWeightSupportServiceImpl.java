package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.CardBin;
import cc.mrbird.system.domain.ItemWeightSupport;
import cc.mrbird.system.domain.Menu;
import cc.mrbird.system.service.ItemWeightSupportService;
import tk.mybatis.mapper.entity.Example;
@Service("itemWeightSupportService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ItemWeightSupportServiceImpl extends BaseService<ItemWeightSupport> implements ItemWeightSupportService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
	@Transactional
	public List<ItemWeightSupport> findAllItemWeightSupport(ItemWeightSupport itemWeightSupport) {
		try {
            Example example = new Example(ItemWeightSupport.class);
            if (StringUtils.isNotBlank(itemWeightSupport.getChannelId())) {
				example.createCriteria().andCondition("CHANNEL_ID=", itemWeightSupport.getChannelId());
			}
            if (StringUtils.isNotBlank(itemWeightSupport.getId())) {
				example.createCriteria().andCondition("ID=", itemWeightSupport.getId());
			}
			example.setOrderByClause("ID");
			return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取服务项目权重失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public ItemWeightSupport findById(ItemWeightSupport itemWeightSupport) {
		return this.selectByKey(itemWeightSupport);
	}

	@Override
	public void updateItemWeightSupport(ItemWeightSupport itemWeightSupport) {
//		if(StringUtils.isAllEmpty(itemWeightSupport.getUserCertEffectDate())) {
//			itemWeightSupport.setUserCertEffectDate(null);
//		}
		Example example = new Example(ItemWeightSupport.class);
        if (StringUtils.isNotBlank(itemWeightSupport.getChannelId())) {
			example.createCriteria().andCondition("CHANNEL_ID=", itemWeightSupport.getChannelId());
		}
        if (StringUtils.isNotBlank(itemWeightSupport.getId())) {
			example.createCriteria().andCondition("ID=", itemWeightSupport.getId());
		}
		this.updateNotNull(itemWeightSupport);
	}

	@Override
	public void deleteItemWeightSupport(ItemWeightSupport itemWeightSupport) {
		this.delete(itemWeightSupport);
	}

	@Override
	public void addItemWeightSupport(ItemWeightSupport itemWeightSupport) {
		this.save(itemWeightSupport);
		
	}
}
