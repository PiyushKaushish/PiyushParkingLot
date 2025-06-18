package org.example;

public class AdditionCalculator {

  int result;

  AdditionCalculator() {
    this.result = 0;
  }

//  public int add(int a, int b) {
//    return a + b;
//  }
//
//  public double add(double a, double b) {
//     double result = (a + b);
//     return result;
//  }

  public double add(int a, double b) {
    double result = (a + b);
    return result;
  }

  public int add(int a, double b) {
    return (int) (a + b);
  }
}
