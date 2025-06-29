package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
  public static void main(String[] args) {

    Engine engineObj = new Engine("test", "test");
    Engine engineObj2 = new Engine("test", "test");
    System.out.println(engineObj.hashCode());
    System.out.println(engineObj2.hashCode());

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    Engine engine = applicationContext.getBean("engine1", Engine.class);
    Engine engine2 = applicationContext.getBean("engine1", Engine.class);
    Car car = applicationContext.getBean(Car.class);
    car.drive();
//    System.out.println(engine.hashCode());
//    System.out.println(engine2.hashCode());
//    Engine engine2 = applicationContext.getBean("engine2", Engine.class);
    //engine.start();
//    engine2.start();
  }
}