package com.tightcoupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();//Therefore here car is dependent on type of engine . But it is tightly coupled with pertrol engine class
        //it means whenever you want to create Car it will be of Petrol Engine only. But we don't want like that
        //we want to something like when we create object of class that time we can decide like which engine car we want.

    }
}
