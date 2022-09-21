package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.MerRefundRate;

public interface MerRefundRateMapper extends MyMapper<MerRefundRate> {
	
	List<MerRefundRate> merRefundRateQuery(MerRefundRate merRefundRate);
	
}