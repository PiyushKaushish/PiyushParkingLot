package org.example.association;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    Driver driver = new Driver("John");
    car.showCar();
    driver.driveCar(car);
  }
}
