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
import cc.mrbird.system.domain.ChannelResult;
import cc.mrbird.system.service.ChannelResultService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("channelResultService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelResultServiceImpl extends BaseService<ChannelResult> implements ChannelResultService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelResult> findAllChannelResults(ChannelResult channelResult) {
		try {
            Example example = new Example(ChannelResult.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(channelResult.getChannelId())) {
            	criteria.andCondition("channel_id=", channelResult.getChannelId());
			}
            if (StringUtils.isNotBlank(channelResult.getChannelType())) {
            	criteria.andCondition("channel_type=", channelResult.getChannelType());
			}
			example.setOrderByClause("CHANNEL_ID,channel_type");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取择优排序列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public ChannelResult findById(ChannelResult channelResult) {
		return this.selectByKey(channelResult);
	}

	@Override
	@Transactional
	public void addChannelResult(ChannelResult channelResult) {
		this.save(channelResult);
	}

	@Override
	@Transactional
	public void updateChannelResult(ChannelResult channelResult) {
		this.updateNotNull(channelResult);	
	}

	@Override
	@Transactional
	public void deleteChannelResult(ChannelResult channelResult) {
		this.delete(channelResult);
	}


}
