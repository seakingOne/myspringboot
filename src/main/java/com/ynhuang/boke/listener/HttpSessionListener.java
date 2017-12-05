package com.ynhuang.boke.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 添加了过滤器和监听器； 注意不要忘记在 SpringBootSampleApplication.java
 * 上添加 @ServletComponentScan 注解。
 * 
 * @author ynhuang
 *
 */
@WebListener
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("Session 被创建");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("ServletContex初始化");
	}

}
