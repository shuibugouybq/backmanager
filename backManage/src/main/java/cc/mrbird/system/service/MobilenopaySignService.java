package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.MobilenopaySign;

public interface MobilenopaySignService extends IService<MobilenopaySign>{

	List<MobilenopaySign> findAllMobilenopaySign(MobilenopaySign mobilenopaySign);

}
