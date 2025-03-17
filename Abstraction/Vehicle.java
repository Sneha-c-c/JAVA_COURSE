package Abstraction;

public abstract class Vehicle {
    String brand;
    Vehicle(String brand){
        this.brand=brand;
    }
    abstract void startEngine();

    void display(){
        System.out.println("Engine of the vehicle is perfect !"+brand);
    }
    
}

