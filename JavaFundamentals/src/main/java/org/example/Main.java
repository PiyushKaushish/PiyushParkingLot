package org.example;

public class Main {
  public static void main(String[] args) {

    Human.incrementCount();
    Human.incrementCount();

    System.out.println(Human.count);

    while(true) {

    }


  }
}

// JVM
// Class Loader Subsystem
   // Loading -> Bootstrap (primordial), platform (extension), application (Method are)
   // Linking
      // Verification -> byte code verification
      // Preparation -> static variable initialization (Method area)
      // Resolution -> linking symbolic references to direct references
   // Initialization -> Initializes the value of static variables, static blocks
// Runtime access area
   // Method area
   // Heap -> objects, instance variables
   // stack -> local variables, method calls
   // PC registers
  // Native method stacks
// Execution Engine
  // JIT Compiler
  // interpretor
  // Garbage Collector
  // profiler
// Java Native Method interfaces