package springmvcInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter  {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("this is prehandler");
		String name=request.getParameter("user");
		if(name.startsWith("d")) {
			System.out.println("invalid name");
			response.setContentType("text/html");
			response.getWriter().println("<h1>This name is invalid TRY AGAIN!!!</h1>");
			return false;
		}else {
			return true;
		}
	}
	
	

}
