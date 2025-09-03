package com.arghya.setter.xml;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppXml {
  public static void main(String[] args){
    try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("setter-config.xml")){
      Car car = ctx.getBean(Car.class);
      System.out.println(car.drive());
    }
  }
}
