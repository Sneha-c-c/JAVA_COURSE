package NestedClasses;

public class Outermemberclass {
    private int data = 90;
    class  Inner{
        void display(){
            System.out.println("data of the inner class "+data);
        }
    }

    public static void main(String[] args) {
        Outermemberclass outer=new Outermemberclass();
        Outermemberclass.Inner inner=outer.new Inner();
        inner.display();
    }
    
}
