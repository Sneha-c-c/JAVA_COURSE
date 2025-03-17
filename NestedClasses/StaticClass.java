package NestedClasses;

public class StaticClass {
    static int data =123;
    static class innerClass{
        public void display(){
            System.out.println("data of the record :"+data);
        }
    }
    public static void main(String[] args) {
        StaticClass.innerClass a=new StaticClass.innerClass();
        a.display();
    }
    
}
