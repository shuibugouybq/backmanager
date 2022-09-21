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
import cc.mrbird.system.domain.MobilenopaySign;
import cc.mrbird.system.service.MobilenopaySignService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("mobilenopaySignService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class MobilenopaySignServiceImpl extends BaseService<MobilenopaySign> implements MobilenopaySignService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<MobilenopaySign> findAllMobilenopaySign(MobilenopaySign mobilenopaySign) {
		try {
			Example example = new Example(MobilenopaySign.class);
			Criteria criteria = example.createCriteria();
			if (StringUtils.isNotBlank(mobilenopaySign.getUserMobile())) {
				criteria.andCondition("USER_MOBILE=", mobilenopaySign.getUserMobile());
			}
			if (StringUtils.isNotBlank(mobilenopaySign.getSignAcctNo())) {
            	criteria.andCondition("SIGN_ACCT_NO=", mobilenopaySign.getSignAcctNo());
			}
			example.setOrderByClause("SIGN_ID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取用户签约信息失败", e);
            return new ArrayList<>();
        }
	}


}
