package Classes;

public class Static {
    private int empid;
    private String empname;
    //instance variable 
    private static String companyName = "metaz";
    //Static block
    static{
        companyName = "vymo";
    }
    //static method
    public static void change(){
        companyName="Appstix";
    }

    Static(int empid,String empname){
        this.empid=empid;
        this.empname=empname;
    }


   void display(){
  System.out.println("Name:"+empname+"Comapny"+companyName+" "+empid);
    }
    
    public static void main(String[] args) {
        Static s1=new Static(101,"sneha");
        s1.display();
        //method
        Static.change();

        Static s2=new Static(102, "Novigo");
        s2.display();




    }
}
