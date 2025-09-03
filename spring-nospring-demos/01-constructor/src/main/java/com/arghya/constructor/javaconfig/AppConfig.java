package com.arghya.constructor.javaconfig;
import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {
  @Bean public Engine engine(){ return new ElectricEngine(); }
  @Bean public Car car(Engine engine){ return new Car(engine); }
}
