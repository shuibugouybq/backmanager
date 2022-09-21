package cc.mrbird.system.dao;

import java.util.List;

import cc.mrbird.common.config.MyMapper;
import cc.mrbird.system.domain.UTransJnl;

public interface UTransJnlMapper extends MyMapper<UTransJnl> {
	
	List<UTransJnl> transQuery(UTransJnl uTransJnl);
}