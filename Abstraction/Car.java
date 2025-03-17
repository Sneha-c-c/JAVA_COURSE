package Abstraction;

public class Car extends Vehicle {
    Car(String brand){
        super(brand);
    }

    public void startEngine(){
        System.out.println("Engine of the class started as : roar roar"+brand);
    }
    
}
