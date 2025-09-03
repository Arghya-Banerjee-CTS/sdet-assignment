package com.arghya.setter.xml;
public class Car {
  private com.arghya.setter.xml.Engine engine;
  public void setEngine(com.arghya.setter.xml.Engine engine){ this.engine = engine; }
  public String drive(){ return engine.start() + " -> drive"; }
}
