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
import cc.mrbird.system.domain.UserBlackWhiteList;
import cc.mrbird.system.service.UserBlackWhiteListService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("userBlackWhiteListService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserBlackWhiteListServiceImpl extends BaseService<UserBlackWhiteList> implements UserBlackWhiteListService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<UserBlackWhiteList> findAllUserBlackWhiteLists(UserBlackWhiteList userBlackWhiteList) {
		try {
            Example example = new Example(UserBlackWhiteList.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(userBlackWhiteList.getCardno())) {
            	criteria.andCondition("cardno=", userBlackWhiteList.getCardno());
			}
			example.setOrderByClause("cardno");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取通道支持银行列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public UserBlackWhiteList findById(UserBlackWhiteList userBlackWhiteList) {
		return this.selectByKey(userBlackWhiteList);
	}

	@Override
	@Transactional
	public void addUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList) {
		this.save(userBlackWhiteList);
	}

	@Override
	@Transactional
	public void updateUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList) {
		this.updateNotNull(userBlackWhiteList);	
	}

	@Override
	@Transactional
	public void deleteUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList) {
		this.delete(userBlackWhiteList);
	}


}
