package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.beans.factory.support.BeanDefinitionRegistry;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Main {

    public static void main(String[] args) {

//        //Using XmlBeanFactory
//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie0 = factory.getBean("movie", Movie.class);
//        System.out.println(movie0);
//
//        //Using BeanDefinitionRegistry and BeanDefinitionReader
//        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie1= ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean(Movie.class);
//        System.out.println(movie1);

        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie);

        //Equality result of two movie beans
        Movie movieA = context.getBean("movieA", Movie.class);
        Movie movieB = context.getBean("movieB", Movie.class);
        System.out.println(movieA==movieB);
    }
}