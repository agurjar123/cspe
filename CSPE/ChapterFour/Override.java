package ChapterFour;

class Override {
     
    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
}
 
// Subclass
class Derived extends Override {
     
    // This method is hidden by display() in Base
    public static void display() {
         System.out.println("Static or class method from Derived");
    }
     
    // This method overrides print() in Base
    public void print() {
        super.print(); 
        System.out.println("Non-static or Instance method from Derived");
   }
}
 
// Driver class
