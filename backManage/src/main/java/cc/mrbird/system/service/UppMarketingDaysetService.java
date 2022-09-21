package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UppMarketingDayset;

public interface UppMarketingDaysetService extends IService<UppMarketingDayset> {

	List<UppMarketingDayset> transQuery(UppMarketingDayset uppMarketingDayset);
}
