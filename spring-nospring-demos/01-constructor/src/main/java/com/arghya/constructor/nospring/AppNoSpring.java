package com.arghya.constructor.nospring;
public class AppNoSpring {
  public static void main(String[] args){
    Car car = new Car(new PetrolEngine());
    System.out.println(car.drive());
  }
}
