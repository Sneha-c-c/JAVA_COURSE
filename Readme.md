JAVA
-------

1.What is java
2.Basic structure of a program

VARIABLE IN JAVA
-----------------

A variable in Java is like a container (box) that holds data (value).

Types of Variables in Java
-----------------------------
There are 3 types of variables in Java:

Local Variable(method variable)
Instance Variable (Non-Static Variable)
Static Variable (Class Variable)


1 Local Variable (Method Level Variable)
------------------------------------------

A variable declared inside a method, constructor, or block is called a local variable.
It is created when the method is called and destroyed when the method ends.
It can only be accessed within that method.
✅ Example: Local Variable

public class Student {
    public void displayInfo() {
        String name = "Sneha";  // Local Variable
        int age = 23;           // Local Variable
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.displayInfo();
    }
}
💡 Output:
Name: Sneha
Age: 23

2  Instance Variable (Non-Static Variable)
-------------------------------------------

A variable declared inside a class but outside a method is called an Instance Variable.
It belongs to the object of the class.
Each object has its own copy of the instance variable.
It is created when the object is created and destroyed when the object is destroyed.


public class Student {
    String name = "Sneha";   // Instance Variable
    int age = 23;            // Instance Variable

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student obj1 = new Student();  // Creating first object
        obj1.displayInfo();

        Student obj2 = new Student();  // Creating second object
        obj2.name = "Rahul";   // Changing name for second object
        obj2.displayInfo();
    }
}


3 Static Variable (Class Variable)
-----------------------------------

A static variable is declared using the static keyword.
It belongs to the class, not to the object.
All objects share the same copy of the static variable.
If you change the value, it reflects in all objects.
It is created only once when the class is loaded into memory.



public class Student {
    static String collegeName = "ABC College";  // Static Variable
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + collegeName);
    }

    public static void main(String[] args) {
        Student obj1 = new Student("Sneha", 23);
        obj1.displayInfo();

        Student obj2 = new Student("Rahul", 25);
        obj2.displayInfo();

        // Changing static variable
        Student.collegeName = "XYZ College";

        obj1.displayInfo();
        obj2.displayInfo();
    }
}




