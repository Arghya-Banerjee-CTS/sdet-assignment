package com.arghya.constructor.javaconfig;
public class Car {
  private final Engine engine;
  public Car(Engine engine){ this.engine = engine; }
  public String drive(){ return engine.start() + " -> drive"; }
}
