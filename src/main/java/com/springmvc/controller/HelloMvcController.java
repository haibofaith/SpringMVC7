package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.beans.UserInfo;

@Controller
@RequestMapping("/hello")
public class HelloMvcController {
	ArrayList<UserInfo> list ;
	@RequestMapping("/mvc")
	public String helloMvc(){
		return "home";
	}
	
	@RequestMapping("/login")
	public @ResponseBody ArrayList<UserInfo> login(){
		return setData1();
	}
	
	public ArrayList<UserInfo> setData1(){
		list = new ArrayList<UserInfo>();
		for (int i = 0; i < 5; i++) {
			list.add(new UserInfo("xionghaibo","haibo1118"));
		}
		return list;
	}
	
	
}
