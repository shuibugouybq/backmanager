package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.OtTrans;

public interface TransQueryService extends IService<OtTrans> {

	List<OtTrans> transQuery(OtTrans otTrans);
	
	List<OtTrans> getCusCount(OtTrans otTrans);
}
