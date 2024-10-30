package listener;

import java.util.Enumeration;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		Enumeration<String> apps = sce.getServletContext().getInitParameterNames();
		while (apps.hasMoreElements()) {
			System.out.println("[리스너] 생성 : " + apps.nextElement());
			
		}
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		Enumeration<String> apps = sce.getServletContext().getInitParameterNames();
		while (apps.hasMoreElements()) {
			System.out.println("[리스너] 소멸 : " + apps.nextElement());
			
		}
	}

	

}
