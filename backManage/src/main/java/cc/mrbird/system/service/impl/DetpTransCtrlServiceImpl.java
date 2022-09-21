package cc.mrbird.system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.dao.DetpTransCtrlMapper;
import cc.mrbird.system.domain.DetpTransCtrl;
import cc.mrbird.system.service.DetpTransCtrlService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;
@Service("detpTransCtrlService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DetpTransCtrlServiceImpl extends BaseService<DetpTransCtrl> implements DetpTransCtrlService {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
    private DetpTransCtrlMapper detpTransCtrl;
	
	@Override
	@Transactional
	public List<DetpTransCtrl> findAllDetpTransCtrls(DetpTransCtrl detpTransCtrl) {
		try {
			return this.detpTransCtrl.listQuery(detpTransCtrl);
        } catch (Exception e) {
            log.error("获取机构交易控制列表失败", e);
            return new ArrayList<>();
        }
	}

	@Override
	@Transactional
	public DetpTransCtrl findById(DetpTransCtrl detpTransCtrl) {
		return this.detpTransCtrl.findById(detpTransCtrl);
	}

	@Override
	@Transactional
	public void insertDetpTransCtrl(DetpTransCtrl detpTransCtrl) {
		this.detpTransCtrl.insertDetpTransCtrl(detpTransCtrl);
	}

	@Override
	@Transactional
	public void updateDetpTransCtrl(DetpTransCtrl detpTransCtrl) {
		this.detpTransCtrl.updateDetpTransCtrl(detpTransCtrl);
	}

	@Override
	@Transactional
	public void deleteDetpTransCtrl(DetpTransCtrl detpTransCtrl) {
		this.detpTransCtrl.deleteDetpTransCtrl(detpTransCtrl);
	}

}
