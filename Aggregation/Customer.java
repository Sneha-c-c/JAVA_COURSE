package Aggregation;

public class Customer {
    private String customername;
    private static String bankName="SBI";
    private Account account;

    public Customer(String customername,Account account){
        this.customername=customername;
        this.account=account;
    }

    public void getDetails(){
        System.out.println("customerName:"+customername+"\nBank:"+bankName);
        account.getAccountDetails();
    }

    public static void main(String[] args) {
        Account a=new Account(101, 6500, "Savings");
        Customer b =new Customer("shamir",a);
        b.getDetails();

    }
    
}
