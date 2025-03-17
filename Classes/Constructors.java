package Classes;

public class Constructors {
    int studentid ;
    String studentname;
    static String university = "Stanford";
    public Constructors(int sid,String sname){
                studentid=sid;
                studentname=sname;
    }
    //constructor overloading and Defauult constructors 
    public Constructors(){

    }
    public void getDetails(){
        System.out.println("Student name"+studentname);
        System.out.println("student id "+studentid);
    }

    public static void main(String[] args) {
        Constructors s1= new Constructors(101, "Anuj");
        s1.getDetails();
        Constructors s2=new Constructors();
        s2.getDetails();
    }
 
}
