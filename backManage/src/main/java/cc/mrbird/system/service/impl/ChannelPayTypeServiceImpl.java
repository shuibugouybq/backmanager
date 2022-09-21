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
import cc.mrbird.system.domain.ChannelPayType;
import cc.mrbird.system.service.ChannelPayTypeService;
import tk.mybatis.mapper.entity.Example;
@Service("channelPayTypeService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelPayTypeServiceImpl extends BaseService<ChannelPayType> implements ChannelPayTypeService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<ChannelPayType> findAllChannelPayType(ChannelPayType channelPayType) {
		try {
            Example example = new Example(ChannelPayType.class);
            if (StringUtils.isNotBlank(channelPayType.getChannelId())) {
				example.createCriteria().andLike("channelId", "%"+channelPayType.getChannelId()+"%");
			}
//			example.setOrderByClause("SIGN_DATE,MODIFY_DATE");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取通道业务信息失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	public void deleteChannelPayType(ChannelPayType channelPayType) {
		this.delete(channelPayType);
	}

	@Override
	public void updateChannelPayType(ChannelPayType channelPayType) {
		this.updateNotNull(channelPayType);
	}

	@Override
	public void addChannelPayType(ChannelPayType channelPayType) {
		this.save(channelPayType);
	}

	





}
