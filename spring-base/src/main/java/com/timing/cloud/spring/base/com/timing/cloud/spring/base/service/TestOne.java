package com.timing.cloud.spring.base.com.timing.cloud.spring.base.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestOne {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ServiceOne one = context.getBean(ServiceOne.class);

        one.say();

        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("application.xml"));
    }
}
