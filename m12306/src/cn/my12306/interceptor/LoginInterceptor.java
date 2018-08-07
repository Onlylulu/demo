package cn.my12306.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	
	//执行Handler完成执行此方法
	//应用场景：统一异常处理，统一日志处理
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}
	
	
	
	//进入Handler方法之后，返回modelAndView之前执行
	//应用场景从modelAndView出发：将公用的模型数据(比如菜单导航)在这里传到视图，也可以在这里统一指定视图
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}
	
	
	
	//进入 Handler方法之前执行
	//用于身份认证、身份授权
	//比如身份认证，如果认证不通过表示当前用户没有登陆，需要此方法拦截不再向下执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		//取得当前请求的url
		String url = request.getRequestURI();
		System.out.println("-------------");
		//如果是登录请求，不拦截
		if(url.indexOf("Login.action")>0) {
			return true;
		}
		
		//取得session中的数据
		HttpSession session = request.getSession();
		Object name = session.getAttribute("username");
		
		//如果用户已经登录，不拦截
		if(name != null) {
			return true;
		}
		
		//执行这里表示用户身份需要认证，跳转登陆页面,此处重定向有错误，必须请求转发
		//response.sendRedirect(request.getContextPath()+"/WEB-INF/jsp/login.jsp");
		request.getRequestDispatcher("index.html").forward(request, response);
		
		return false;
		
	}

}


