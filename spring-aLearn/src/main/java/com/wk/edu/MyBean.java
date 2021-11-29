package com.wk.edu;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author Wk
 * @version 1.0
 * @date 2021/11/22 23:40
 */
@Component
public class MyBean implements InitializingBean {
	public MyBean() {
		System.out.println("MyBean构造器。。。");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean:afterPropertiesSet");
	}
}
