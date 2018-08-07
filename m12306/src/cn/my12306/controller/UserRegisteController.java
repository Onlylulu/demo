package cn.my12306.controller;

import java.util.HashMap;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.my12306.bean.User;
import cn.my12306.service.UserService;

@Controller
public class UserRegisteController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/Registe",method={RequestMethod.POST}, produces = "application/json;charset=UTF-8")
	public @ResponseBody String Registe(@RequestParam String username,
										@RequestParam String pwd,
										@RequestParam String realname,
										@RequestParam Integer sex,
										@RequestParam String city,
										@RequestParam String certType,
										@RequestParam String cert,
										@RequestParam String birthday,
										@RequestParam String userType,
										@RequestParam String content) throws Exception{
		
		User user=new User(0, username, pwd, 0, realname, sex, city, certType, 
							cert, birthday, userType, content, 1, null, null);
		int rs=userService.register(user);
		
		ObjectMapper mapper=new ObjectMapper();
		HashMap<String, String> map=new HashMap<String, String>();
		if(rs>0)
		{
			map.put("status", "true");
			map.put("msg", "注册成功！");
		}
		else
		{
			map.put("status", "false");
			map.put("msg", "注册失败！");
		}
	
		return mapper.writeValueAsString(map);
	}
}


