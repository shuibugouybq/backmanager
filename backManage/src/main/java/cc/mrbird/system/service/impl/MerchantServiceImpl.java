package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.Merchant;
import cc.mrbird.system.service.MerchantService;
import tk.mybatis.mapper.entity.Example;
@Service("merchantService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MerchantServiceImpl extends BaseService<Merchant> implements MerchantService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<Merchant> findAllMerchants(Merchant merchant) {
		try {
            Example example = new Example(Merchant.class);
            if (StringUtils.isNotBlank(merchant.getMerId())) {
				example.createCriteria().andCondition("MER_ID=", merchant.getMerId());
			}
			example.setOrderByClause("MER_ID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取商户列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public void addMerchant(Merchant merchant) {
		int i = (int) (Math.random()*1000000);
		merchant.setMerId(i+"");
		this.save(merchant);
	}

	@Override
	@Transactional
	public void updateMerchant(Merchant merchant) {
		this.updateAll(merchant);
	}

	@Override
	@Transactional
	public void deleteMerchants(String merIds) {
		List<String> list = Arrays.asList(merIds.split(","));
        this.batchDelete(list, "merId", Merchant.class);
	}

	@Override
	@Transactional
	public Merchant findById(String merId) {
		return this.selectByKey(merId);
	}

}
