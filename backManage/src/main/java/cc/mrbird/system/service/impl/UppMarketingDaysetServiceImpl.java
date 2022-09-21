package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.ChannelResult;
import cc.mrbird.system.domain.UppMarketingDayset;
import cc.mrbird.system.service.UppMarketingDaysetService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("uppMarketingDaysetService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppMarketingDaysetServiceImpl extends BaseService<UppMarketingDayset> implements UppMarketingDaysetService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<UppMarketingDayset> transQuery(UppMarketingDayset uppMarketingDayset) {
		try {
            Example example = new Example(ChannelResult.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(uppMarketingDayset.getTransSettseqno())) {
            	criteria.andCondition("TRANS_SETTSEQNO=", uppMarketingDayset.getTransSettseqno());
			}
			example.setOrderByClause("TRANS_SETTSEQNO DESC");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取营销日结列表失败", e);
            return new ArrayList<>();
        }
	}

}
