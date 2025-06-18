package org.example;

public interface VehicleBehaviour {

  public int MAX_SPEED = 120;

  void start();


  void stop();


  void igniteEngine();

  default void calculate(int a, int b) {

  }


  default void calculate(double a, double b) {

  }
}
