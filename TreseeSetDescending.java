import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator{
    @Override
    public int compare(Object obj1,Object obj2){
        //   Integer i1=(Integer)obj1;
        //   Integer i2 = (Integer) obj2;
        // String s1=(String)obj1;
        // String s2=(String)obj2;
        // return s2.compareTo(s1);

        //====string buffer

        // String sb1= obj1.toString();
        // String sb2 = obj2.toString();
        // return sb1.compareTo(sb2);

        //==Comparin the  stringBuffer and String

        String ss1= obj1.toString();
        String ss2= obj2.toString();

        int l1=ss1.length();
        int l2=ss2.length();
        if(l1<l2){
            return -1;
        }
        else if(l1>l2){
            return 1;
        }
        else{
            return ss1.compareTo(ss2);
        }

        //To lengthy to use  
        //   if(i1<i2){
        //     return 1;
        //   }
        //   else if(i1>i2){
        //     return -1;
        //   }
        //   else{
        //     return 0;
        //   }
        //   //return I1.compareTo(I2); ascending order in customised sorting
          /// return -I1.compareTo(I2); descending order in customised sorting
          // return I2.compareTo(I1); descending order in customised sorting
         // return -I2.compareTo(I1); ascending order in customised sorting
         //return +1 //for insertion order[10,0,2,3,2]
         //return 0 //only first element are inserted all other elements considered as duplicates
    }

}

public class TreseeSetDescending {
    public static void main(String[] args) {
        TreeSet t=new TreeSet<>(new myComparator());

       // ====== Integer sort=======
        // t.add(1);
        // t.add(10);
        // t.add(8);
        // t.add(16);
        // t.add(30);
        // t.add(3);
        // System.out.println(t);

        // ====String sorting==========
        // t.add("sneha");
        // t.add("Anusha");
        // t.add("Ajay");
        // t.add("Raja kumari");
        // System.out.println(t);
        

        //=====StringBuffer object =====
        // t.add(new StringBuffer("A"));
        // t.add(new StringBuffer("F"));
        // t.add(new StringBuffer("K"));
        // t.add(new StringBuffer("Z"));
 
        //=====Hetero=====
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("SBC"));
        t.add("Rayan");
        t.add(new StringBuffer("DBC"));
        t.add("Anusha");
        t.add(new StringBuffer("ZAFGHJHJHJH"));
        System.out.println(t);

    }
    
}
