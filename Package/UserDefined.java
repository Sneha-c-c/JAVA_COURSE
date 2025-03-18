package Package;

public class UserDefined {
    private int a;
     public UserDefined(int a){
        this.a=a;
    }

    public void display(){
        System.out.println("data : "+a);
    }
    public static void main(String[] args) {
        UserDefined a=new UserDefined(101);
        a.display();
    }
    
}
