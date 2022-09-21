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
import cc.mrbird.system.domain.UTransJnl;
import cc.mrbird.system.service.UTransJnlService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("uTransJnlService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UTransJnlServiceImpl extends BaseService<UTransJnl> implements UTransJnlService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<UTransJnl> transQuery(UTransJnl uTransJnl) {
		try {
            Example example = new Example(UTransJnl.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(uTransJnl.getSeqNo())) {
            	criteria.andCondition("SEQ_NO=", uTransJnl.getSeqNo());
			}
            if (StringUtils.isNotBlank(uTransJnl.getMerId())) {
            	criteria.andCondition("MER_ID=", uTransJnl.getMerId());
			}
            if (StringUtils.isNotBlank(uTransJnl.getBeginDate())) {
            	criteria.andCondition("date_format(TRANS_DATE,'%Y-%m-%d') >=", uTransJnl.getBeginDate());
            }
            if (StringUtils.isNotBlank(uTransJnl.getEndDate())) {
            	criteria.andCondition("date_format(TRANS_DATE,'%Y-%m-%d') <=", uTransJnl.getEndDate());
            }
			example.setOrderByClause("MER_ID,SEQ_NO,TRANS_DATE");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取无卡支付日志列表失败", e);
            return new ArrayList<>();
        }
	}


}
