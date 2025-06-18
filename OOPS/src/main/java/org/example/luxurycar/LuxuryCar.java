package org.example.luxurycar;

import org.example.BankAccount;
import org.example.Car;
import org.example.VehicleBehaviour;


public class LuxuryCar extends Car {

  private String soundSystem;

  private String airConditioner;

  public LuxuryCar() {
    soundSystem = "Premium Sound System";
    airConditioner = "Automatic Climate Control";
  }

  @Override
  public void startCar() {
    super.startEngine();
  }

  @Override
  public void behaviour() {
    System.out.println("Manual");
  }

  public LuxuryCar(String providedModel, int providedNumberOfWheels, String providedEngine, String providedSoundSystem, String providedAirConditioner){
    super(providedModel, providedNumberOfWheels, providedEngine);
    numberOfWheels = providedNumberOfWheels;
    engine = providedEngine;
    soundSystem = providedSoundSystem;
    airConditioner = providedAirConditioner;
  }

  public void displayDetails() {
    System.out.println("Luxury Car Details:");
    System.out.println("Model: " + super.model);
    System.out.println("Engine: " + engine);
    System.out.println("Number of wheels: " + numberOfWheels);
    System.out.println("Sound System: " + soundSystem);
    System.out.println("Air Conditioner: " + airConditioner);
  }

  @Override
  public void start() {
    System.out.println("Luxury Car started");
  }

  @Override
  public void stop() {
    System.out.println("Luxury Car stopped");
  }

  @Override
  public void igniteEngine() {
    System.out.println("Luxury Car engine ignited");
  }

  @Override
  public void somerandomBehaviour() {
    System.out.println(VehicleBehaviour.MAX_SPEED);

  }
}
