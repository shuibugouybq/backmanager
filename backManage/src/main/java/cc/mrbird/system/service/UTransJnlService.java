package cc.mrbird.system.service;

import java.util.List;

import cc.mrbird.common.service.IService;
import cc.mrbird.system.domain.UTransJnl;

public interface UTransJnlService extends IService<UTransJnl> {

	List<UTransJnl> transQuery(UTransJnl uTransJnl);
}
