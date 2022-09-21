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
import cc.mrbird.system.domain.UppBatchctrl;
import cc.mrbird.system.service.UppBatchctrlService;
import tk.mybatis.mapper.entity.Example;
@Service("uppBatchctrlService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UppBatchctrlServiceServiceImpl extends BaseService<UppBatchctrl> implements UppBatchctrlService{
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public List<UppBatchctrl> findAlluppBatchctrl(UppBatchctrl uppBatchctrl) {
		try {
			 Example example = new Example(UppBatchctrl.class);
	         if (StringUtils.isNotBlank(uppBatchctrl.getBpDepartmentid())) {
					example.createCriteria().andLike("bpDepartmentid", "%"+uppBatchctrl.getBpDepartmentid()+"%");
				}
	         if (StringUtils.isNotBlank(uppBatchctrl.getShardingKey())) {
					example.createCriteria().andLike("shardingKey", "%"+uppBatchctrl.getShardingKey()+"%");
				}
//			example.setOrderByClause("BANK_ID,CARD_BIN");
          return this.selectByExample(example);
      } catch (Exception e) {
          log.error("通道项目打分表失败", e);
          return new ArrayList<>();
      }
	}

	@Override
	public void addUppBatchctrl(UppBatchctrl uppBatchctrl) {
		this.save(uppBatchctrl);
	}

	@Override
	public void updateUppBatchctrl(UppBatchctrl uppBatchctrl) {
		this.updateNotNull(uppBatchctrl);
	}

	@Override
	public void deleteUppBatchctrl(UppBatchctrl uppBatchctrl) {
		this.delete(uppBatchctrl);
	}







}
