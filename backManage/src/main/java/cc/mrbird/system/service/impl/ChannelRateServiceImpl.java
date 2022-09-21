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
import cc.mrbird.system.domain.ChannelRate;
import cc.mrbird.system.service.ChannelRateService;
import tk.mybatis.mapper.entity.Example;
@Service("channelRateService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelRateServiceImpl extends BaseService<ChannelRate> implements ChannelRateService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelRate> findAllChannelRate(ChannelRate channelRate) {
		try {
            Example example = new Example(ChannelRate.class);
            if (StringUtils.isNotBlank(channelRate.getRateId())) {
				example.createCriteria().andLike("rateId", "%"+channelRate.getRateId()+"%");
			}
//			example.setOrderByClause("SIGN_DATE,MODIFY_DATE");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取通道费率信息失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public void addChannelRate(ChannelRate channelRate) {
		this.save(channelRate);
		
	}

	@Override
	@Transactional
	public void deleteChannelRate(ChannelRate channelRate) {
		this.delete(channelRate);
		
	}

	@Override
	@Transactional
	public void updateChannelRate(ChannelRate channelRate) {
		this.updateNotNull(channelRate);
	}







}
