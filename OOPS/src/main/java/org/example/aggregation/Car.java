package org.example.aggregation;

public class Car {

  private String model;

  // Aggregation / Composition
  public Engine _engine;

  Car(String model, Engine engine) {
    this.model = model;
    this._engine = engine;
  }

  public void showCar() {
    System.out.println("Car model: " + model);
    _engine.showEngine();
  }

  public void dummy(Bike bike) {

  }
}
