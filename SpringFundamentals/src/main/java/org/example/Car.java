package org.example;

public class Car {
  private Engine engine;

  private String carType;

  public Car(Engine engine, String carType) {
    this.engine = engine;
    this.carType = carType;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public void drive() {
    engine.start();
    System.out.println("Driving the car " + carType);
  }
}
