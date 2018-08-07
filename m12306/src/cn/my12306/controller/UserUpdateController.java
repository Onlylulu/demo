package cn.my12306.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.my12306.service.UserService;

@Controller
public class UserUpdateController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping
	public @ResponseBody String Update(@RequestParam Integer id){
		return "";
	}
}
