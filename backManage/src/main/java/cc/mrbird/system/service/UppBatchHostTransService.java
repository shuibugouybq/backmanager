package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppBatchHostTrans;

public interface UppBatchHostTransService extends IService<UppBatchHostTrans> {

	List<UppBatchHostTrans> listQuery(UppBatchHostTrans uppBatchHostTrans);
	
}
