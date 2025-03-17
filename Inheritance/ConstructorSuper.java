package Inheritance;

public class ConstructorSuper extends EmpConstructor {
    int bonus;
    public ConstructorSuper(int empid,String empName,Double salary ,int bonus){
        super(empid,empName,salary);
        this.bonus=bonus;
    }
 
    // Overriding
    // we cannot access the privayte variables use protetected or use get method
    @Override
    public void calSalary() {
        byte var1 = 30;
        byte var2 = 12;
        byte var3 = 14;
        double var4 = getBasic() + getBasic() * (double) (var1 + var2 + var3) / 100.0 + bonus;
        System.out.println("total salary of an employee : " + var4);
    }
    

    @Override
    public void disp() {
        super.disp();
        System.out.println(" " + bonus);
    }

    public static void main(String[] args) {
        ConstructorSuper empData=new ConstructorSuper(1001,"QWERTY", 100000.0, 10000);
        empData.disp();
        empData.calSalary();//static polymorphism
        System.out.println("******************************************");

        EmpConstructor newEmp= new  ConstructorSuper(1002, "Aishwarya", 200000.0, 20000);//upcasting
        newEmp.disp();//Overidden = run time polymorphism
        newEmp.calSalary();
        System.out.println("******************************************");

        EmpConstructor employee=new EmpConstructor(1003,"Suhana", 300000.0);
        employee.disp();//Parents object
        employee.calSalary();// static binding
        System.out.println("******************************************");

        //specify upasting like =parent reference refering to child object

        employee=empData;
        employee.disp();//run time polymorphism
        employee.calSalary();
        System.out.println("******************************************");
    }
}
       
