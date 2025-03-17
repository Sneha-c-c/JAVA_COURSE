package Interface;

interface XYZ {
   // Default method
   default void msg() {
      System.out.println("This is the interface default method called by creating an object");
      show(); // Calling private method inside a default method
   }

   // Static method
   static void reply() {
      System.out.println("This is a static method and does not require an object to call this");
      hide(); // Calling private static method inside static method
   }

   // Private instance method (only callable inside default methods)
   private void show() {
      System.out.println("This method cannot be called directly; it is defined inside another method in the interface");
   }

   // Private static method (only callable inside static methods)
   private static void hide() {
      System.out.println("This cannot be called directly, only through a static method");
   }
}

// Class implementing the interface
public class ABC implements XYZ {
   public static void main(String[] args) {
      XYZ.reply(); // Calling static method without an object

      ABC obj = new ABC(); // Creating an instance of ABC
      obj.msg(); // Calling default method
   }
}
