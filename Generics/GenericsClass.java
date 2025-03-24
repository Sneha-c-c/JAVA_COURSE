package Generics;

public class GenericsClass<T> {
    private T value;
    GenericsClass(T value){
        this.value=value;
    }

    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value=value;
    }
    public static void main(String[] args) {
        GenericsClass<Integer> a=new GenericsClass<Integer>(101);
        System.out.println("The value is :"+ a.getValue());

        GenericsClass<String> b = new GenericsClass<String>("suvarna");
        System.out.println("\nThe value is :" + b.getValue());
    }
    
}
