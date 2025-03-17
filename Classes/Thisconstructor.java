package Classes;

public class Thisconstructor {
    private int empid;
    private String empName;
    private static String companyname = "Metaz digital";
    private String city;
    //Suppose if i want to use the same name as instance variable which can access to current class object we are using this
    public Thisconstructor(int empid, String empName){
        this.empid=empid;
        this.empName=empName;
    }
    //this() access to current constructor
    public Thisconstructor(int empid, String empName,String city) {
        this(empid,empName);
        this.city=city;
    }
    public void display(){
        System.out.println("Name:"+empName+"EmpId:"+empid+"Company:"+companyname+"city:"+city);
    }

    public static void main(String[] args) {
        Thisconstructor e1=new Thisconstructor(101,"Sahana");
        e1.display();
        Thisconstructor e2 = new Thisconstructor(102, "Sahana","Bengaluru");
        e2.display();
        
    }



    
}
