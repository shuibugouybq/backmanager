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
import cc.mrbird.system.domain.UserPayTypeSignInfo;
import cc.mrbird.system.service.UserPayTypeSignInfoService;
import tk.mybatis.mapper.entity.Example;
@Service("userPayTypeSignInfoService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserPayTypeSignInfoServiceImpl extends BaseService<UserPayTypeSignInfo> implements UserPayTypeSignInfoService{
	private Logger log = LoggerFactory.getLogger(this.getClass());



	@Override
	public List<UserPayTypeSignInfo> findAllUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo) {
		try {
			 Example example = new Example(UserPayTypeSignInfo.class);
	         if (StringUtils.isNotBlank(userPayTypeSignInfo.getSignnbr())) {
					example.createCriteria().andLike("signnbr", "%"+userPayTypeSignInfo.getSignnbr()+"%");
				}
	         if (StringUtils.isNotBlank(userPayTypeSignInfo.getUsernbr())) {
					example.createCriteria().andLike("usernbr", "%"+userPayTypeSignInfo.getUsernbr()+"%");
				}
	         if (StringUtils.isNotBlank(userPayTypeSignInfo.getSignmobile())) {
					example.createCriteria().andLike("signmobile", "%"+userPayTypeSignInfo.getSignmobile()+"%");
				}
	         if (StringUtils.isNotBlank(userPayTypeSignInfo.getSigncardnbr())) {
					example.createCriteria().andLike("signcardnbr", "%"+userPayTypeSignInfo.getSigncardnbr()+"%");
				}
//			example.setOrderByClause("BANK_ID,CARD_BIN");
          return this.selectByExample(example);
      } catch (Exception e) {
          log.error("用户支付产品签约管理失败", e);
          return new ArrayList<>();
      }
	}

	@Override
	public void addUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo) {
		this.save(userPayTypeSignInfo);
	}

	@Override
	public void deleteUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo) {
		this.delete(userPayTypeSignInfo);
	}

	@Override
	public void updateUserPayTypeSignInfo(UserPayTypeSignInfo userPayTypeSignInfo) {
		this.updateNotNull(userPayTypeSignInfo);
	}





}
