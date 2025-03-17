package Classes;

public class Student {
    int sid;
    String sname;
    double gpa;
    static String university = "Stanford";

    public void setStudentDetails(int id,String name,double cgpa){
        sid=id;
        sname=name;
        gpa=cgpa;
    }

    public void getStudentDetails(){
        System.out.println("Name :"+sname+" "+sid+" "+gpa+" "+university);
    }
    
}
