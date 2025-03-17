package Inheritance;

public class EmpConstructor {
    private int eid;
    private String ename;
    private double basic; // basic salary - allowances
    private static String org = "Google";

    // parameterized cons - 3 instance
    public EmpConstructor(int eid, String ename, double basic){
      this.eid = eid;
      this.ename = ename;
      this.basic = basic;
	}

    public double getBasic() {
        return basic;
    }

    public void disp() {
        System.out.println(eid + " " + ename + " " + basic + " " + org);
    }

    public void calSalary() {
        // local variables - as allowances
        int da = 42;
        int hra = 30;
        int ta = 8;
        double salary = basic + basic * (da + hra + ta) / 100;
        System.out.println("Total Salary: " + salary);
    }
    
}
