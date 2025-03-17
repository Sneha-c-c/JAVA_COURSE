package NestedClasses;
abstract class Vehicle{
    abstract void start();
}

public class Anonymous {
    public static void main(String[] args) {
        Vehicle v=new Vehicle() {
            void start(){
                System.out.println("car starts");
            }
        };
        v.start();
    }
    
}
