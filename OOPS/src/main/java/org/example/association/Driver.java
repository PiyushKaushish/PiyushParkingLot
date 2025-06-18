package org.example.association;

public class Driver {


  private String name;

  Driver(String name) {
    this.name = name;
  }

  public void showDriver() {
    System.out.println("Driver name: " + name);
  }

  public void driveCar(List<Car> cars) {
    System.out.println(name + " is driving the car");
    car.showCar();
  }
}
