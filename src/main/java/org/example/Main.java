package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.GasPoweredCar;
import org.example.arge.ElectricCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {

        CarSkeleton carSkeleton = new CarSkeleton();
        carSkeleton.startEngine();
        carSkeleton.drive();

        CarSkeleton gasPoweredCar = new GasPoweredCar("Ford", "Gas powered car", 6.5,8 );
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        CarSkeleton electricCar = new ElectricCar("Tesla", "Electric car", 500.5, 100);
        electricCar.startEngine();
        electricCar.drive();

        CarSkeleton hybridCar = new HybridCar("Toyota", "Hybrid car", 3.5, 75, 4);
        hybridCar.startEngine();
        hybridCar.drive();
    }
}