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
import cc.mrbird.system.domain.ChannelItemScore;
import cc.mrbird.system.domain.ChannelLimitFractions;
import cc.mrbird.system.service.ChannelCtrlDayfractService;
import cc.mrbird.system.service.ChannelItemScoreService;
import cc.mrbird.system.service.ChannelLimitFractionsService;
import tk.mybatis.mapper.entity.Example;
@Service("channelLimitFractionsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelLimitFractionsServiceImpl extends BaseService<ChannelLimitFractions> implements ChannelLimitFractionsService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<ChannelLimitFractions> findAllChannelLimitFractions(ChannelLimitFractions channelLimitFractions) {
		try {
			 Example example = new Example(ChannelLimitFractions.class);
	         if (StringUtils.isNotBlank(channelLimitFractions.getChannelId())) {
					example.createCriteria().andLike("channelId", "%"+channelLimitFractions.getChannelId()+"%");
				}
//			example.setOrderByClause("BANK_ID,CARD_BIN");
          return this.selectByExample(example);
      } catch (Exception e) {
          log.error("通道项目限额表失败", e);
          return new ArrayList<>();
      }
	}

	@Override
	public void addChannelLimitFractions(ChannelLimitFractions channelLimitFractions) {
		
		this.save(channelLimitFractions);
	}

	@Override
	public void updateChannelLimitFractions(ChannelLimitFractions channelLimitFractions) {
		this.updateNotNull(channelLimitFractions);
	}

	@Override
	public void deleteChannelLimitFractions(ChannelLimitFractions channelLimitFractions) {
		this.delete(channelLimitFractions);
	}






}
