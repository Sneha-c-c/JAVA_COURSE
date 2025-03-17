package Interface;

public class SBI implements RBI {
    public void deposit(){
       System.out.println("Your cas is deposited to bank ");
    }

    public void credit(){
       System.out.println("Your account credited at the @"+intRate);

    }

    public void withDraw(){
       System.out.println("Your account withdrawn");
    }

    void transact(){
        System.out.println("Transction been successfull");
    }

    public static void main(String[] args) {
        RBI person= new SBI();//upcasting
        person.deposit();
        person.credit();
        person.withDraw();

        SBI personew= new SBI();
        personew.transact();
    }


    
}
