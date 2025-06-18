package org.example;

public abstract class Car implements VehicleBehaviour, VehicleBehaviour2 {

  public String model;

  protected int numberOfWheels;

  protected String engine;

  public Car() {
    this("test", 4, "V8");
  }

  public Car(String model, int numberOfWheels, String engine) {
    this.model = model;
    this.numberOfWheels = numberOfWheels;
    this.engine = engine;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void displayCarDetails(Car car) {
    System.out.println("Car Details:");
    System.out.println("Model: " + car.getModel());
    System.out.println("Engine: " + car.getEngine());
    System.out.println("Number of wheels: " + car.getNumberOfWheels());
  }

  public void displaySelfCarDetails() {
    displayCarDetails(this);
  }

  public void startEngine() {
    System.out.println("Engine started");
  }

  public abstract void startCar();

  public void behaviour() {
    System.out.println("Automatic");
  }
}
