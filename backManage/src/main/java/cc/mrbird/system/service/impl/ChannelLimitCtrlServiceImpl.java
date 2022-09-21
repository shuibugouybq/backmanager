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
import cc.mrbird.system.domain.ChannelLimitCtrl;
import cc.mrbird.system.service.ChannelLimitCtrlService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("ChannelLimitCtrlsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelLimitCtrlServiceImpl extends BaseService<ChannelLimitCtrl> implements ChannelLimitCtrlService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelLimitCtrl> findAllChannelLimitCtrls(ChannelLimitCtrl channelLimitCtrl) {
		try {
            Example example = new Example(ChannelLimitCtrl.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(channelLimitCtrl.getChannelId())) {
            	criteria.andCondition("channel_Id=", channelLimitCtrl.getChannelId());
			}
            if(StringUtils.isNotBlank(channelLimitCtrl.getChannelType())) {
            	criteria.andCondition("CHANNEL_TYPE=", channelLimitCtrl.getChannelType());
            }
			example.setOrderByClause("CHANNEL_ID,CHANNEL_TYPE");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取通道信息列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public ChannelLimitCtrl findById(ChannelLimitCtrl channelLimitCtrl) {
		return this.selectByKey(channelLimitCtrl);
	}

	@Override
	@Transactional
	public void addChannelLimitCtrl(ChannelLimitCtrl channelLimitCtrl) {
		this.save(channelLimitCtrl);
	}

	@Override
	@Transactional
	public void updateChannelLimitCtrl(ChannelLimitCtrl channelLimitCtrl) {
		this.updateNotNull(channelLimitCtrl);
	}

	@Override
	@Transactional
	public void deleteChannelLimitCtrl(ChannelLimitCtrl channelLimitCtrl) {
		this.delete(channelLimitCtrl);
	}

}
