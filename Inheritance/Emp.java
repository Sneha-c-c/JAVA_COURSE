package Inheritance;

public class Emp {
    private int empid;
    private String empName;
    private Double salary;
    private static String org="Metaz";
    //For super keyword we dont need this 
    public double getbasic(){
        return salary;
    }
     public void setEmployee(int empid,String empName,Double salary){
        this.empid=empid;
        this.empName=empName;
        this.salary=salary;
     }
     //super keyword(comment while using)
     public Emp(int empid,String empName,Double salary){
         this.empid = empid;
         this.empName = empName;
         this.salary = salary;
     }

     public void display(){
        System.out.println(empid+" "+empName+" "+salary+" "+org);
     }

     public void calSalary(){
        int da= 30;
        int ta=12;
        int hrs=14;
        double totalsalry =  salary+(salary*(da+ta+hrs))/100;
        System.out.println("total salry : "+totalsalry);
     }
    
}
