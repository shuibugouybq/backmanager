package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.ChannelCtrlDayFractions;
import cc.mrbird.system.service.ChannelCtrlDayfractService;
import tk.mybatis.mapper.entity.Example;
@Service("channelCtrlDayfractService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelCtrlDayfractServiceImpl extends BaseService<ChannelCtrlDayFractions> implements ChannelCtrlDayfractService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelCtrlDayFractions> findAllChannelCtrlDayfract(ChannelCtrlDayFractions channelCtrlDayFractions) {
		try {
			 Example example = new Example(ChannelCtrlDayFractions.class);
	         if (StringUtils.isNotBlank(channelCtrlDayFractions.getChannelId())) {
					example.createCriteria().andLike("channelId", "%"+channelCtrlDayFractions.getChannelId()+"%");
				}
//			example.setOrderByClause("BANK_ID,CARD_BIN");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("通道历史得分表失败", e);
            return new ArrayList<>();
        }
	}


}
