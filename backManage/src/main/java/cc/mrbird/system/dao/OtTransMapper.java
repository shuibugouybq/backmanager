package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.OtTrans;

public interface OtTransMapper extends MyMapper<OtTrans> {
	
	List<OtTrans> transQuery(OtTrans otTrans);
	
	List<OtTrans> getCusCount(OtTrans otTrans);
}