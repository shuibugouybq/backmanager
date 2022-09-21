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
import cc.mrbird.system.domain.UppBatchProcess;
import cc.mrbird.system.service.UppBatchProcessService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("uppBatchProcessService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchProcessServiceImpl extends BaseService<UppBatchProcess> implements UppBatchProcessService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<UppBatchProcess> findAllUppBatchProcesss(UppBatchProcess uppBatchProcess) {
		try {
            Example example = new Example(UppBatchProcess.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(uppBatchProcess.getShardingKey())) {
            	criteria.andCondition("SHARDING_KEY=", uppBatchProcess.getShardingKey());
			}
            if (StringUtils.isNotBlank(uppBatchProcess.getDepartmentId())) {
            	criteria.andCondition("DEPARTMENT_ID=", uppBatchProcess.getDepartmentId());
			}
			example.setOrderByClause("SHARDING_KEY,DEPARTMENT_ID");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取进程控制列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public UppBatchProcess findById(UppBatchProcess uppBatchProcess) {
		return this.selectByKey(uppBatchProcess);
	}

	@Override
	@Transactional
	public void addUppBatchProcess(UppBatchProcess uppBatchProcess) {
		this.save(uppBatchProcess);
	}

	@Override
	@Transactional
	public void updateUppBatchProcess(UppBatchProcess uppBatchProcess) {
		this.updateNotNull(uppBatchProcess);	
	}

	@Override
	@Transactional
	public void deleteUppBatchProcess(UppBatchProcess uppBatchProcess) {
		this.delete(uppBatchProcess);
	}


}
