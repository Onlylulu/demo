package cn.my12306.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
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
public class UserLoginController {
	
	@Autowired
	private UserService UserService;
	
	@RequestMapping(value="/Login",method={RequestMethod.POST})
	public @ResponseBody String Login(@RequestParam String name,
									  @RequestParam String pwd,
									  HttpSession session) throws JsonGenerationException, JsonMappingException, IOException{
		//2、调方法
		User user=UserService.login(name, pwd);
		
		//3、

		ObjectMapper mapper=new ObjectMapper();
		HashMap<String, Object> map=new HashMap<String, Object>();
		if(null!=user){
/*			session.setAttribute("user", user);*/
			String users=mapper.writeValueAsString(user);
			map.put("status", "true");
			map.put("msg", "登录成功！");
			map.put("user",users);
		}else{
			map.put("status", "false");
			map.put("msg", "登录失败，请重新登录！");
		}
		return 	mapper.writeValueAsString(map);
	}
}
