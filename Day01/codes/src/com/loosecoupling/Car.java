package com.loosecoupling;

//you can to create based on type of engine
public class Car {
    Engine e;
    Car(Engine e){
        this.e = e;
    }
    void move(){
        System.out.println("Car moves with : ");
        e.show();
    }
}
