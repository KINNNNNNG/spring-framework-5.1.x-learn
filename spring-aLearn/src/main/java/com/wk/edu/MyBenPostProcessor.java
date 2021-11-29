package com.wk.edu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Wk
 * @version 1.0
 * @date 2021/11/23 22:56
 */
@Component
public class MyBenPostProcessor implements BeanPostProcessor {

	public MyBenPostProcessor() {
		System.out.println("MyBenPostProcessor构造器");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("myBean".equalsIgnoreCase(beanName)) {
			System.out.println("BeanPostProcessor:Before");
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("myBean".equalsIgnoreCase(beanName)) {
			System.out.println("BeanPostProcessor:After");
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
