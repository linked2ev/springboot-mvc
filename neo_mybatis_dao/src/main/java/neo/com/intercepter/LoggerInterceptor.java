package neo.com.intercepter;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoggerInterceptor extends HandlerInterceptorAdapter {

//	public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		
//		log.debug("============================== START ==============================");
//		log.debug(" Req");
//		
//		return super.preHandle(request, response, handler)
//	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		log.debug("============================== START ==============================");
		log.info(" Class       \t:  " + handler.getClass());
		log.info(" Request URI \t:  " + request.getRequestURI());
		log.info(" Servlet URI \t:  " + request.getServletPath());
		
		Enumeration<String> paramNames = request.getParameterNames();
		
		while (paramNames.hasMoreElements()) {
			String key = (String) paramNames.nextElement();  
			String value = request.getParameter(key);
			log.info("# RequestParameter Data:  " + key + "= " + value + "");
		}
		log.info("==================================================================== ");

		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		//log.info("======================================           END          ======================================");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		log.info("======================================           END          ======================================");
	}
}
