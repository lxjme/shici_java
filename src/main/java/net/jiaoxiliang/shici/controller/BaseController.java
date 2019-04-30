package net.jiaoxiliang.shici.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BaseController
 */
public class BaseController {

    public Map<String,Object> jsonReturn(int status,String msg){
		return result(status,msg,null);
	}
	
	public Map<String,Object> jsonReturn(int status,String msg,Object data){
		return result(status,msg,data);
	}

	public Map<String,Object> success(){
		return success("success",null);
	}
	
	public Map<String,Object> success(String msg){
		return success(msg,null);
	}
	
	public Map<String,Object> success(String msg,Object data){
		return result(1,msg,data);
	}
	
	private Map<String,Object> result(Integer status,String msg,Object data){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("status", status);
		map.put("msg", msg);
		//如果data为空集合，统一返回的null
		if(data!=null){
			if(data instanceof Map){
				if(((Map<?,?>)data).isEmpty()){
					data=null;
				}
			}else if(data instanceof List){
				if(((Collection<?>) data).isEmpty()){
					data=null;
				}
			}
		}
		map.put("data", data);
		
		return map;
	}
}