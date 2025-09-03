package com.arghya.setter.nospring;
public class AppNoSpring {
  public static void main(String[] args){
    Car car = new Car();
    car.setEngine(new CngEngine());
    System.out.println(car.drive());
  }
}
