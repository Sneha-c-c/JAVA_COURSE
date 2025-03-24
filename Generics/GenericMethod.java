package Generics;

public class GenericMethod {
    
    public static<T> void printArray(T[] array){
        for(T element: array){
            System.out.println(element);
        }
        System.out.println(" ");
        
    }
    public static void main(String[] args) {
        Integer[] a={2,3,4,5,6};
        String[] b={"anu","thanu","dhanu"};
        printArray(a);
        printArray(b);
}
}
