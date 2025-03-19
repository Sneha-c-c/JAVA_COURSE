package Exceptions;

public class CalculateAgeUserdefined {
    public void validate(int age) throws UserInvalidException {
        if(age<18){
            throw new UserInvalidException("Age is restricted for voting");
        }
        else{
            System.out.println("you are eligible for the vote");
        }
        
    }
    public static void main(String[] args) {
        CalculateAgeUserdefined v1=new CalculateAgeUserdefined();
        try{
            v1.validate(60);
            v1.validate(17);
        }
        catch(Exception e){
            System.err.println(e);
        }
        finally{
            System.out.println("Closed");
        }
        System.out.println("Finally always gets executed");
    }
    
}
