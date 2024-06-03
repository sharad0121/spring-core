package org.core.staticfactory.test;

import org.core.staticfactory.main.Appointment;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class StaticFactoryMethod {
    public static void main(String[] args) {
        // XmlBeanFactory is deprecated and there is new way to load bean
        // with the help of DefaultListableBeanFactory
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("org/core/staticfactory/common/application-context.xml"));

        Appointment appointment = beanFactory.getBean("appointment", Appointment.class);
        System.out.println(appointment);
    }
}
