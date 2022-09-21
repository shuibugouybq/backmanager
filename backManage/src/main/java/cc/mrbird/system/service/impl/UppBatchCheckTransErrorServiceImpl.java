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
import cc.mrbird.system.dao.UppBatchCheckTransErrorMapper;
import cc.mrbird.system.domain.OtTrans;
import cc.mrbird.system.domain.UppBatchCheckTransError;
import cc.mrbird.system.service.UppBatchCheckTransErrorService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("uppBatchCheckTransErrorService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchCheckTransErrorServiceImpl extends BaseService<UppBatchCheckTransError> implements UppBatchCheckTransErrorService {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private UppBatchCheckTransErrorMapper uppBatchCheckTransErrorMapper;

	@Override
	@Transactional
	public List<UppBatchCheckTransError> findAllUppBatchCheckTransErrors(UppBatchCheckTransError uppBatchCheckTransError) {
		try {
            Example example = new Example(UppBatchCheckTransError.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(uppBatchCheckTransError.getErrorSeqno())) {
            	criteria.andCondition("ERROR_SEQNO=", uppBatchCheckTransError.getErrorSeqno());
			}
            if (StringUtils.isNotBlank(uppBatchCheckTransError.getShardingKey())) {
            	criteria.andCondition("SHARDING_KEY=", uppBatchCheckTransError.getShardingKey());
			}
			example.setOrderByClause("ERROR_SEQNO,SHARDING_KEY,TRANS_CLEARDATE DESC");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取对账差错明细列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public UppBatchCheckTransError findById(UppBatchCheckTransError uppBatchCheckTransError) {
		return this.selectByKey(uppBatchCheckTransError);
	}

	@Override
	@Transactional
	public void addUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError) {
		this.save(uppBatchCheckTransError);
	}

	@Override
	@Transactional
	public void updateUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError) {
		this.updateNotNull(uppBatchCheckTransError);	
	}

	@Override
	@Transactional
	public void deleteUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError) {
		this.delete(uppBatchCheckTransError);
	}
	
	@Override
	@Transactional
	public List<UppBatchCheckTransError> getCheckErrorCount(UppBatchCheckTransError upp) {
		List<UppBatchCheckTransError>  list = this.uppBatchCheckTransErrorMapper.getCheckErrorCount(upp);
		return list.get(0) == null ? null : list;
	}

}
