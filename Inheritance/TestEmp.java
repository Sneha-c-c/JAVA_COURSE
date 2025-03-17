package Inheritance;

public class TestEmp  extends Emp{

    int bonus;
    //Child class have own data members and methods
    public void setBonus(int bonus){
        this.bonus=bonus;
    }
    public void getBonus(){
        System.out.println(bonus);
    }
    //Overriding
    // we cannot access the privayte variables use protetected or use get method
    @Override
    public void calSalary() {
        byte var1 = 30;
        byte var2 = 12;
        byte var3 = 14;
        double var4 = getbasic() + getbasic() * (double) (var1 + var2 + var3) / 100.0+bonus;
        System.out.println("total salary of an employee : " + var4);
    }
    //superkeyword  suppose to access private data members and method everytime we cannot use protected / write getter for the each 
    @Override
    public void display(){
        super.display();
        System.out.println(" "+bonus);
    }


    public static void main(String[] args) {
        TestEmp emp=new TestEmp();
        emp.setEmployee(1001, "suhana", 908.0);
        emp.display();
        emp.setBonus(1000);
        emp.calSalary();

    }
    
}
