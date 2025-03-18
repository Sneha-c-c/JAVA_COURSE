package Package;
import java.util.*;//Implicit import
import java.util.Date;//Explicit import

public class PrintDate {
    public static void main(String[] args) {
        Date d=new Date();
        //if import not there
        // java.util.Date d= new java.util.Date()
        System.out.println("Date : "+d);
    }
    
}
