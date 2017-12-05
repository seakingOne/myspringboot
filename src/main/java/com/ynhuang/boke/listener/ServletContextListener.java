package com.ynhuang.boke.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

/**
 * 
 * @author ynhuang
 *
 */
@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener {
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("ServletContex销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("ServletContex初始化");
		// 获取服务器的信息
		System.out.println(sce.getServletContext().getServerInfo());
	}
}
