package com.tightcoupling;
//you can to create based on type of engine
public class Car {
    PetrolEngine e;
    Car(){
        e = new PetrolEngine();
    }
    void move(){
        System.out.println("Car moves with : ");
        e.show();
    }
}
