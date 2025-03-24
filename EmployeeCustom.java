import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
    String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString(){
        return name+"==="+id;
    }

    public int compareTo(Object obj){
        int eid1=this.id;
        Employee e=(Employee)obj;
        int eid2=e.id;
        if(eid1<eid2){
            return -1;
        }
        else if(eid1>eid2){
            return 1;
        }
        else{
            return 0;
        }

    }
    
}

class myComparator implements Comparator{
      public int compare(Object obj1,Object obj2){
        Employee e1=(Employee)obj1;
        Employee e2=(Employee)obj2;
        return e1.compareTo(e2);
      }
}
 
public class EmployeeCustom {
    public static void main(String[] args) {
        TreeSet defSetExample = new TreeSet<>();
        Employee e1= new Employee("Sneha", 107);
        Employee e2 = new Employee("Ajay", 104);
        Employee e3 = new Employee("Karunya", 102);
        Employee e4 = new Employee("Sneha", 109);
        Employee e5 = new Employee("Sneha", 101);
        defSetExample.add(e1);
        defSetExample.add(e2);
        defSetExample.add(e3);
        defSetExample.add(e4);
        defSetExample.add(e5);
        System.out.println("Default example\n");
        System.out.println(defSetExample);
        TreeSet customSetExample = new TreeSet<>(new myComparator());
        customSetExample.add(e1);
        customSetExample.add(e2);
        customSetExample.add(e3);
        customSetExample.add(e4);
        customSetExample.add(e5);
        System.out.println("\n\nCustom example \n");
        System.out.println(customSetExample);
        
    }
}
