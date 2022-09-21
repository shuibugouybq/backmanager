package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.ChannelInfo;
import cc.mrbird.system.domain.Param;
import cc.mrbird.system.service.ChannelInfoService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("channelInfoService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelInfoServiceImpl extends BaseService<ChannelInfo> implements ChannelInfoService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelInfo> findAllChannelInfos(ChannelInfo channelInfo) {
		try {
            Example example = new Example(ChannelInfo.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(channelInfo.getChannelId())) {
            	criteria.andCondition("channel_id=", channelInfo.getChannelId());
			}
			example.setOrderByClause("CHANNEL_ID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取通道信息列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public ChannelInfo findById(ChannelInfo channelInfo) {
		return this.selectByKey(channelInfo);
	}

	@Override
	@Transactional
	public void addChannelInfo(ChannelInfo channelInfo) {
		this.save(channelInfo);
	}

	@Override
	@Transactional
	public void updateChannelInfo(ChannelInfo channelInfo) {
		this.updateNotNull(channelInfo);	
	}

	@Override
	@Transactional
	public void deleteChannelInfo(ChannelInfo channelInfo) {
		this.delete(channelInfo);
	}

	@Override
	public Map<String, String> queryDicMap() {
		Map<String, String> map = new HashMap<String, String>();
		List<ChannelInfo> list = this.selectAll();
		for (ChannelInfo channelInfo : list) {
			map.put(channelInfo.getChannelId(), channelInfo.getChannelName());
		}
		return map;
	}


}
