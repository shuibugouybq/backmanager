package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.domain.Param;
import cc.mrbird.system.service.ParamService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("paramService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class ParamServiceImpl extends BaseService<Param> implements ParamService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	@Transactional
	public List<Param> findAllParams(Param param) {
		try {
			Example example = new Example(Param.class);
			Criteria criteria = example.createCriteria();
            if (StringUtils.isNotBlank(param.getParamType())) {
            	criteria.andNotEqualTo("paramType", param.getParamType());
			}
            if (StringUtils.isNotBlank(param.getParentParmaId())) {
            	criteria.andCondition("parent_parma_id=", param.getParentParmaId());
			}
            if (StringUtils.isNotBlank(param.getParamValue())) {
            	criteria.andCondition("param_value=", param.getParamValue());
			}
            if (StringUtils.isNotBlank(param.getParamName())) {
            	criteria.andLike("paramName", "%"+param.getParamName()+"%");
			}
            return this.selectByExample(example);
        } catch (Exception e) {
            log.error("获取字典列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public Param findById(Param param) {
		return this.selectByKey(param);
	}

	@Override
	@Transactional
	public void addParam(Param param) {
		this.save(param);
	}

	@Override
	@Transactional
	public void updateParam(Param param) {
		this.updateNotNull(param);
	}

	@Override
	@Transactional
	public void deleteParam(String ids) {
		List<String> list = Arrays.asList(ids.split(","));
		this.batchDelete(list, "id", Param.class);
	}

}
