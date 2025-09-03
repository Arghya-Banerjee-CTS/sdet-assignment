package com.arghya.setter.javaconfig;
import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
  @Bean public Engine engine(){ return new TurboEngine(); }
  @Bean public Car car(Engine engine){ Car c = new Car(); c.setEngine(engine); return c; }
}
