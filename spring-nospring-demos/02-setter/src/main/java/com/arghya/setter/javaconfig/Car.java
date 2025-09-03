package com.arghya.setter.javaconfig;
public class Car {
  private Engine engine;
  public void setEngine(Engine engine){ this.engine = engine; }
  public String drive(){ return engine.start() + " -> drive"; }
}
