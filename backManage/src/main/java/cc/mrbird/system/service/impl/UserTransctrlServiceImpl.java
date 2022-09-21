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
import cc.mrbird.system.domain.UserTransctrl;
import cc.mrbird.system.service.UserTransctrlService;
import tk.mybatis.mapper.entity.Example;
@Service("userTransctrlService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserTransctrlServiceImpl extends BaseService<UserTransctrl> implements UserTransctrlService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<UserTransctrl> findAllUserTransctrls(UserTransctrl userTransctrl) {
		try {
            Example example = new Example(UserTransctrl.class);
            if (StringUtils.isNotBlank(userTransctrl.getUserAcctNo())) {
				example.createCriteria().andCondition("USER_ACCT_NO=", userTransctrl.getUserAcctNo());
			}
            if(StringUtils.isNotBlank(userTransctrl.getTransId())) {
            	example.createCriteria().andCondition("TRANS_ID=", userTransctrl.getTransId());
            }
			example.setOrderByClause("USER_ACCT_NO,TRANS_ID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取用户交易限额列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public UserTransctrl findById(UserTransctrl userTransctrl) {
		return this.selectByKey(userTransctrl);
	}

	@Override
	@Transactional
	public void updateUserTransctrl(UserTransctrl userTransctrl) {
		this.updateNotNull(userTransctrl);
	}

	@Override
	@Transactional
	public void deleteUserTransctrl(UserTransctrl userTransctrl) {
		this.delete(userTransctrl);
	}

}
