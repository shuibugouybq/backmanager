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
import cc.mrbird.system.domain.UppBatchDepartment;
import cc.mrbird.system.service.UppBatchDepartmentService;
import tk.mybatis.mapper.entity.Example;
@Service("uppBatchDepartmentService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchDepartmentServiceServiceImpl extends BaseService<UppBatchDepartment> implements UppBatchDepartmentService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<UppBatchDepartment> findAllUppBatchDepartment(UppBatchDepartment uppBatchDepartment) {
		try {
			 Example example = new Example(UppBatchDepartment.class);
	         if (StringUtils.isNotBlank(uppBatchDepartment.getDepartmentId())) {
					example.createCriteria().andLike("departmentId", "%"+uppBatchDepartment.getDepartmentId()+"%");
				}
//			example.setOrderByClause("BANK_ID,CARD_BIN");
         return this.selectByExample(example);
     } catch (Exception e) {
         log.error("通道项目打分表失败", e);
         return new ArrayList<>();
     }
	}

	@Override
	public void addUppBatchDepartment(UppBatchDepartment uppBatchDepartment) {
		this.save(uppBatchDepartment);
	}

	@Override
	public void deleteUppBatchDepartment(UppBatchDepartment uppBatchDepartment) {
		this.delete(uppBatchDepartment);
	}

	@Override
	public void updateUppBatchDepartment(UppBatchDepartment uppBatchDepartment) {
		this.updateNotNull(uppBatchDepartment);
	}







}
