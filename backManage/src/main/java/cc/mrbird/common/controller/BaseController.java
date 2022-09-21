package cc.mrbird.common.controller;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.github.pagehelper.PageInfo;

import cc.mrbird.system.domain.ChannelBank;
import cc.mrbird.system.domain.ChannelPayType;
import cc.mrbird.system.domain.User;

public class BaseController {

	protected Map<String, Object> getDataTable(PageInfo<?> pageInfo) {
		Map<String, Object> rspData = new HashMap<>();
		rspData.put("rows", pageInfo.getList());
		rspData.put("total", pageInfo.getTotal());
		return rspData;
	}

	public static Subject getSubject() {
		return SecurityUtils.getSubject();
	}

	protected User getCurrentUser() {
		return (User) getSubject().getPrincipal();
	}

	protected Session getSession() {
		return getSubject().getSession();
	}

	protected Session getSession(Boolean flag) {
		return getSubject().getSession(flag);
	}

	protected void login(AuthenticationToken token) {
		getSubject().login(token);
	}
	
	protected Map<String, String> getDic(String dicName){
		Session session  = this.getSession();
		@SuppressWarnings("unchecked")
		Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
		return dictMap.get(dicName);
	}
	
	protected Map<String, String> toMap(List<Object> list,String key,String value) throws Exception{
		Map<String, String> map =new HashMap<String, String>();
		if(list.size()>0) {
			for (Object obj : list) {
				Class<? extends Object> clazz = obj.getClass();
				Field fieldKey = clazz.getDeclaredField(key);
				Field fieldValue = clazz.getDeclaredField(value);
				fieldKey.setAccessible(true);
				fieldValue.setAccessible(true);
				String k = (String) fieldKey.get(obj);
				String v = (String) fieldValue.get(obj);
				map.put(k, v);
			}
		}
		return map;
	}
}
