package Aggregation;

public class Account {

    private int accountno;
    private int balance;
    private String accountType;

    public Account(int accountno,int balance,String accountType){
        this.accountno=accountno;
        this.accountType=accountType;
        this.balance=balance;
    }
    public void getAccountDetails(){
        System.out.println("Account no:"+accountno+"\nAccount type:"+accountType+"\nbalence:"+balance);
    }
    
}
