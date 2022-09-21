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
import cc.mrbird.system.domain.CustomerSign;
import cc.mrbird.system.service.CustomerSignService;
import tk.mybatis.mapper.entity.Example;
@Service("customerSignService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class CustomerSignServiceImpl extends BaseService<CustomerSign> implements CustomerSignService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<CustomerSign> findAllCustomerSigns(CustomerSign customerSign) {
		try {
            Example example = new Example(CustomerSign.class);
            if (StringUtils.isNotBlank(customerSign.getUserMobile())) {
				example.createCriteria().andCondition("USER_MOBILE=", customerSign.getUserMobile());
			}
            if (StringUtils.isNotBlank(customerSign.getSignAcctNo())) {
				example.createCriteria().andCondition("SIGN_ACCT_NO=", customerSign.getSignAcctNo());
			}
			example.setOrderByClause("SIGN_DATE,MODIFY_DATE");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取用户支付产品签约失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	public void updateCustomerSign(CustomerSign customerSign) {
		if(StringUtils.isAllEmpty(customerSign.getUserCertEffectDate())) {
			customerSign.setUserCertEffectDate(null);
		}
		this.updateNotNull(customerSign);
	}

	@Override
	public void deleteCustomerSign(CustomerSign customerSign) {
		this.delete(customerSign);
	}
}
