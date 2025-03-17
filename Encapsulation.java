
public class Encapsulation {
    private int empid;
    private String name;
    private static String company="Metaz";

    public void setNames(int id,String sname){
     empid=id;
     name=sname;
    }

    public void display(){
        System.out.println("Name:"+name+"\nId"+empid+"\nCompany"+company);
    }
    public static void main(String[] args) {

        Encapsulation s1=new Encapsulation();
        s1.setNames(101, "Sahana");
        s1.display();
        
    }
    
}
