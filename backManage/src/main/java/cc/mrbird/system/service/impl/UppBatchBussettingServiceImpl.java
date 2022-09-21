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
import cc.mrbird.system.domain.UppBatchBussetting;
import cc.mrbird.system.service.UppBatchBussettingService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("uppBatchBussettingService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchBussettingServiceImpl extends BaseService<UppBatchBussetting> implements UppBatchBussettingService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<UppBatchBussetting> findAllUppBatchBussettings(UppBatchBussetting uppBatchBussetting) {
		try {
            Example example = new Example(UppBatchBussetting.class);
            Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(uppBatchBussetting.getBusDepartmentid())) {
            	criteria.andCondition("BUS_DEPARTMENTID=", uppBatchBussetting.getBusDepartmentid());
			}
            if (StringUtils.isNotBlank(uppBatchBussetting.getShardingKey())) {
            	criteria.andCondition("SHARDING_KEY=", uppBatchBussetting.getShardingKey());
			}
			example.setOrderByClause("BUS_DEPARTMENTID,SHARDING_KEY");
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取业务参数失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public UppBatchBussetting findById(UppBatchBussetting uppBatchBussetting) {
		return this.selectByKey(uppBatchBussetting);
	}

	@Override
	@Transactional
	public void addUppBatchBussetting(UppBatchBussetting uppBatchBussetting) {
		this.save(uppBatchBussetting);
	}

	@Override
	@Transactional
	public void updateUppBatchBussetting(UppBatchBussetting uppBatchBussetting) {
		this.updateNotNull(uppBatchBussetting);	
	}

	@Override
	@Transactional
	public void deleteUppBatchBussetting(UppBatchBussetting uppBatchBussetting) {
		this.delete(uppBatchBussetting);
	}


}
