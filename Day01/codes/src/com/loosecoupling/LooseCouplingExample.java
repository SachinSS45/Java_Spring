package com.loosecoupling;
//we want to something like when we create object of class that time we can decide like which engine car we want.

public class LooseCouplingExample {
    public static void main(String[] args) {
        Car c = new Car(new PetrolEngine());
        c.move();
        Car c2 = new Car(new DieselEngine());
        c.move();
        //Now Car class is loosely coupled with
    }
}
