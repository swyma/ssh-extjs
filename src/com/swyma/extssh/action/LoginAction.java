package com.swyma.extssh.action;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.swyma.extssh.service.UserService;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	private String type;
	private String start;
	private String limit;
	
	private UserService userService;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		/*HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		
		String count="select count(*) from User user where user.flag='1'";
		String hql="from User user where user.flag='1'";
		//获取相应的数据
		List users=userService.getUser(hql, new Integer(getStart()), new Integer(getLimit()));
		JSONArray json=JSONArray.fromObject(users);
		response.getWriter().write("{\"success\":true,\"totalCount\":" + userService.getCount(count)+ ",\"users\":" + json.toString() + "}");
		return null;*/
		System.out.println("process come here...");
		return null;
		
	}

}
