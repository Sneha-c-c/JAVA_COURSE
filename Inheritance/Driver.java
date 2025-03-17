package Inheritance;

public class Driver  extends Emp {
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.setEmployee(1001, "Sneha", 90000.0);
        e1.display();
        e1.calSalary();
    }
    
}
