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
import cc.mrbird.system.domain.ChannelBank;
import cc.mrbird.system.service.ChannelBankService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("channelBankService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ChannelBankServiceImpl extends BaseService<ChannelBank> implements ChannelBankService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<ChannelBank> findAllChannelBanks(ChannelBank channelBank) {
		try {
            Example example = new Example(ChannelBank.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(channelBank.getBankId())) {
            	criteria.andCondition("bank_id=", channelBank.getBankId());
			}
            if (StringUtils.isNotBlank(channelBank.getBankName())) {
				criteria.andLike("bankName", "%"+channelBank.getBankName()+"%");
			}
			example.setOrderByClause("bank_id");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取机构列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public ChannelBank findById(ChannelBank channelBank) {
		return this.selectByKey(channelBank);
	}

	@Override
	@Transactional
	public void addChannelBank(ChannelBank channelBank) {
		this.save(channelBank);
	}

	@Override
	@Transactional
	public void updateChannelBank(ChannelBank channelBank) {
		this.updateNotNull(channelBank);
	}

	@Override
	@Transactional
	public void deleteChannelBank(ChannelBank channelBank) {
		this.delete(channelBank);
	}

	@Override
	public Map<String, String> getChannelBank() {
		Map<String, String> map = new HashMap<String, String>();
		List<ChannelBank> list = this.selectAll();
		for (ChannelBank channelInfo : list) {
			map.put(channelInfo.getBankId(), channelInfo.getBankName());
		}
		return map;
	}
}
