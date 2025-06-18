package org.example;

public class Human {
  int numberOfEars;

  int numberOfEyes;

  String name;

  int age;

  static int count;

  static {
    System.out.println("Static block executed. Initializing static variables.");
    count = 0; // Initialize static variable count
  }

  Human() {
    count = 10;
    age = 10;
    name = "Default Name";
    numberOfEyes = 2;
    numberOfEars = 2;
  }

  Human(String providedName, int providedAge, int providedNumberOfEyes, int providedNumberOfEars) {
    name = providedName;
    age = providedAge;
    numberOfEyes = providedNumberOfEyes;
    numberOfEars = providedNumberOfEars;
  }

  void sleep() {
    System.out.println("Sleeping...");
  }


  void speak() {
    int i = 20;
    count++;
    System.out.println("Hello, my name is " + name + ", I am " + age + " years old." + i);
  }

  static void incrementCount() {
    count++;
    //System.out.println("Name is " + name);
  }
}
