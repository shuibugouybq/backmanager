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
import cc.mrbird.system.service.ChannelCtrlDayfractService;
import cc.mrbird.system.service.ChannelItemScoreService;
import tk.mybatis.mapper.entity.Example;
@Service("channelItemScoreService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelItemScoreServiceImpl extends BaseService<ChannelItemScore> implements ChannelItemScoreService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelItemScore> findAllChannelItemScores(ChannelItemScore channelItemScore) {
		try {
			 Example example = new Example(ChannelItemScore.class);
	         if (StringUtils.isNotBlank(channelItemScore.getChannelId())) {
					example.createCriteria().andLike("channelId", "%"+channelItemScore.getChannelId()+"%");
				}
//			example.setOrderByClause("BANK_ID,CARD_BIN");
           return this.selectByExample(example);
       } catch (Exception e) {
           log.error("通道项目打分表失败", e);
           return new ArrayList<>();
       }
	}

	@Override
	@Transactional
	public void addChannelItemScore(ChannelItemScore channelItemScore) {
		this.save(channelItemScore);
	}

	@Override
	@Transactional
	public void updateChannelItemScore(ChannelItemScore channelItemScore) {
		this.updateNotNull(channelItemScore);
	}

	@Override
	@Transactional
	public void deleteChannelItemScore(ChannelItemScore channelItemScore) {
		this.delete(channelItemScore);
		
	}





}
