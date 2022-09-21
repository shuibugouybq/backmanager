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
import cc.mrbird.system.domain.ChannelCtrlFractions;
import cc.mrbird.system.service.ChannelCtrlFractionsService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("channelCtrlFractionsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelCtrlFractionsServiceImpl extends BaseService<ChannelCtrlFractions> implements ChannelCtrlFractionsService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<ChannelCtrlFractions> transQuery(ChannelCtrlFractions channelCtrlFractions) {
		try {
            Example example = new Example(ChannelCtrlFractions.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(channelCtrlFractions.getChannelId())) {
            	criteria.andCondition("CHANNEL_ID=", channelCtrlFractions.getChannelId());
			}
			example.setOrderByClause("CHANNEL_ID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取交易成功率列表失败", e);
            return new ArrayList<>();
        }
	}


}
