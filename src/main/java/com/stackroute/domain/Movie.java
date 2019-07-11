package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements BeanFactoryAware, ApplicationContextAware, BeanNameAware {

    Actor actor, actress, sidekick;

    public Movie(){

    }

    public Movie(Actor actor, Actor actress, Actor sidekick) {
        this.actor = actor;
        this.actress = actress;
        this.sidekick = sidekick;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void setActress(Actor actress) {
        this.actress = actress;
    }

    public void setSidekick(Actor sidekick) {
        this.sidekick = sidekick;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", actress=" + actress +
                ", sidekick=" + sidekick +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory : "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name : "+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application : "+applicationContext);
    }
}
