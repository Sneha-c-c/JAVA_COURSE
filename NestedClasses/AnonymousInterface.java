package NestedClasses;

public interface AnonymousInterface {

    void eat();
    void speak();
    
    public static void main(String[] args) {
        AnonymousInterface a=new AnonymousInterface(){
            public void eat(){
                System.out.println("Eating");
            }
            public void speak(){
                System.out.println("speaking");
            }
        };

        a.eat();
        a.speak();
    }

    
} 
