package com.zcm.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("OK");
		return "success";
	}
}
