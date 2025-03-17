package Classes;

public class Copyconstructor {
    String name;
    int age;
    
    Copyconstructor(String sname,int sage){
        name=sname;
        age=sage;
    }

    Copyconstructor(Copyconstructor s){
        name=s.name;
        age=s.age;
    }

    void display(){
        System.out.println("Sname :"+name+" Sage :"+age);
    }
    
    public static void main(String[] args) {
        Copyconstructor s1= new Copyconstructor("Havan",13);
        Copyconstructor s2=new Copyconstructor(s1);
        s1.display();;
        s2.display();   
    }
}
