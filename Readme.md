# **Java Learning Roadmap**

## **1️⃣ Variables in Java**
- Variables are containers for storing data values.
- Types of variables:
  - **Local Variable** (Declared inside a method, accessible only within that method)
  - **Instance Variable** (Defined in a class but outside any method, belongs to an instance)
  - **Static Variable** (Defined using `static`, shared across all instances of a class)

## **2️⃣ Data Types in Java**
- **Primitive Data Types** (int, char, double, boolean, etc.)
- **Non-Primitive Data Types** (Strings, Arrays, Classes, Interfaces)

## **3️⃣ Operators in Java**
- **Arithmetic Operators** (+, -, *, /, %)
- **Relational Operators** (==, !=, >, <, >=, <=)
- **Logical Operators** (&&, ||, !)
- **Bitwise Operators** (&, |, ^, ~, <<, >>, >>>)

## **4️⃣ Bitwise Operators (Shift Operations)**
- **Left Shift (`<<`)**: Multiplies by 2^n
- **Right Shift (`>>`)**: Divides by 2^n (Maintains sign bit for negative numbers)
- **Unsigned Right Shift (`>>>`)**: Fills leading bits with 0 (Only for positive numbers)

## **5️⃣ Literals in Java**
- Numeric (int, float, double)
- Character (`'A'`)
- String (`"Hello"`)
- Boolean (`true`, `false`)

## **6️⃣ Conditional Statements in Java**
- **if, if-else, nested if, switch-case**
- Used for decision-making

## **7️⃣ Loops in Java**
- **For Loop** (Used when number of iterations is known)
- **While Loop** (Executes until condition is false)
- **Do-While Loop** (Executes at least once before checking condition)

## **8️⃣ Break and Continue in Java**
- **Break**: Stops loop execution immediately
- **Continue**: Skips current iteration and moves to next

## **9️⃣ Arrays in Java**
- **Single-Dimensional Arrays** (Stores elements in a linear form)
- **Multi-Dimensional Arrays** (Stores elements in tabular form)
- **Array Methods**: `length`, `copyOf()`, `sort()`, etc.

## **🔟 Keywords in Java**
- **Reserved words** used in Java (static, final, abstract, etc.)

## **1️⃣1️⃣ Methods in Java**
- **Method Declaration**
- **Method Calling**
- **Method Overloading & Overriding**

## **1️⃣2️⃣ Variable Arguments (Varargs) in Java**
- Allows passing multiple arguments of the same type to a method
- Syntax: `void methodName(int... numbers) {}`

## **1️⃣3️⃣ Object-Oriented Programming (OOP) in Java**
- **Encapsulation** (Data hiding using private variables)
- **Inheritance** (One class acquiring properties of another)
- **Polymorphism** (Method overloading and overriding)
- **Abstraction** (Hiding implementation details, showing only functionality)

## **1️⃣4️⃣ Constructors in Java**
- **Default Constructor** (No parameters)
- **Parameterized Constructor** (Takes parameters)
- **Copy Constructor** (Creates a copy of another object)

## **1️⃣5️⃣ This Keyword in Java**
- Refers to current object instance

## **1️⃣6️⃣ Static Keyword in Java**
- **Static variables**: Shared across all instances
- **Static methods**: Can be called without an object
- **Static blocks**: Executed before the main method

## **1️⃣7️⃣ Access Modifiers in Java**
- **Private** (Accessible within the same class)
- **Default** (Accessible within the same package)
- **Protected** (Accessible in subclasses)
- **Public** (Accessible everywhere)

## **1️⃣8️⃣ Aggregation and Composition in Java**
- **Aggregation**: "Has-a" relationship where objects are linked but can exist independently.
- **Composition**: Strong "Has-a" relationship where dependent objects cannot exist without the main object.

## **1️⃣9️⃣ Super Keyword in Java**
- Refers to parent class variables, methods, and constructors

## **2️⃣0️⃣ StringBuilder and StringBuffer in Java**
- **StringBuilder**: Faster, non-synchronized (Not thread-safe)
- **StringBuffer**: Synchronized (Thread-safe but slower)

## **2️⃣1️⃣ compareTo() and compareToIgnoreCase()**
- **compareTo()**: Compares two strings lexicographically (case-sensitive)
- **compareToIgnoreCase()**: Compares two strings ignoring case

## **2️⃣2️⃣ Abstract Method vs Concrete Method**
- **Abstract Method**: Declared but not implemented in an abstract class
- **Concrete Method**: Fully implemented method

## **2️⃣3️⃣ Abstract Classes in Java**
- Cannot be instantiated
- Can have both abstract and concrete methods

## **2️⃣4️⃣ Interfaces in Java**
- Defines abstract methods that must be implemented in subclasses

## **2️⃣5️⃣ Nested Classes in Java**
- **Static Nested Class** (Accessed without object of outer class)
- **Non-Static Nested Class (Inner Class)**
- **Local Inner Class** (Inside a method)
- **Anonymous Inner Class** (Without a class name)

## **2️⃣6️⃣ Exceptions in Java**
- **Checked Exceptions**: Compile-time errors (IOException, SQLException)
- **Unchecked Exceptions**: Runtime errors (NullPointerException, ArithmeticException)
- **Exception Handling Mechanisms**:
  - `try-catch`
  - `finally`
  - `throw`
  - `throws`
  - Custom Exceptions

