package Generics;
//We can restrict a type parameter to subclasses of a particular class using extends.

class Numberbox<T extends Number>{
    private T value;
    Numberbox(T value){
        this.value=value;
    }

    public double square(){
       return value.doubleValue()*value.doubleValue();
    }
}

public class GenericRestriction {
    public static void main(String[] args) {
        Numberbox<Integer> a=new Numberbox(10);
        System.out.println(a.square()); 
        
        Numberbox<Double> b=new Numberbox(9.0);
        System.out.println(b.square());

        //if i use the string this will throw an error 
    }
    
}
