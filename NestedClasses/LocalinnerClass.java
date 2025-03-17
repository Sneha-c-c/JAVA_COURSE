package NestedClasses;

public class LocalinnerClass {
    private String data="Redbull";

    public void displayData(){

        class LocalInner{
            void makesound(){
                System.out.println("Data been vanished :"+data);
            }
        }

        LocalInner localclass=new LocalInner();
        localclass.makesound();
    }

    public static void main(String[] args) {
        LocalinnerClass localpart=new LocalinnerClass();
        localpart.displayData();
    }
    
}
