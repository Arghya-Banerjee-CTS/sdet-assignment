package com.arghya.setter.javaconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AppJavaConfig {
  public static void main(String[] args){
    try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
      Car car = ctx.getBean(Car.class);
      System.out.println(car.drive());
    }
  }
}
