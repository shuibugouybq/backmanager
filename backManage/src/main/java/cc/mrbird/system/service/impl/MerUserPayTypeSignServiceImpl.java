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
import cc.mrbird.system.domain.MerUserPayTypeSign;
import cc.mrbird.system.service.MerUserPayTypeSignService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("merUserPayTypeSignService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MerUserPayTypeSignServiceImpl extends BaseService<MerUserPayTypeSign> implements MerUserPayTypeSignService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<MerUserPayTypeSign> findAllMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign) {
		try {
            Example example = new Example(MerUserPayTypeSign.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(merUserPayTypeSign.getSigntypcd())) {
            	criteria.andCondition("SIGNTYPCD=", merUserPayTypeSign.getSigntypcd());
			}
            if (StringUtils.isNotBlank(merUserPayTypeSign.getMerplatformcd())) {
            	criteria.andCondition("MERPLATFORMCD=", merUserPayTypeSign.getMerplatformcd());
			}
            if (StringUtils.isNotBlank(merUserPayTypeSign.getUsernbr())) {
            	criteria.andCondition("USERNBR=", merUserPayTypeSign.getUsernbr());
			}
            if (StringUtils.isNotBlank(merUserPayTypeSign.getUseracctnbr())) {
            	criteria.andCondition("USERACCTNBR=", merUserPayTypeSign.getUseracctnbr());
			}
			example.setOrderByClause("SIGNNBR,SIGNTYPCD");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取用户商户平台支付产品签约列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public MerUserPayTypeSign findById(MerUserPayTypeSign merUserPayTypeSign) {
		return this.selectByKey(merUserPayTypeSign);
	}

	@Override
	@Transactional
	public void addMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign) {
		this.save(merUserPayTypeSign);
	}

	@Override
	@Transactional
	public void updateMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign) {
		this.updateNotNull(merUserPayTypeSign);
	}

	@Override
	@Transactional
	public void deleteMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign) {
		this.delete(merUserPayTypeSign);
	}
}
