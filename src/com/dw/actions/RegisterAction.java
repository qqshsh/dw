package com.dw.actions;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.dw.entity.User;
import com.dw.service.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	private UserServiceImpl userService;
	private String result;
	@Override
	public User getModel(){
		return user;
	}
	public String getResult(){
		return result;
	}
	public void setUserService(UserServiceImpl userService){
		this.userService = userService;
	}
	public String exeute(){
		userService.addUser(user);
		result = "注册成功";
		return SUCCESS;
	}
}
