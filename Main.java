import java.util.function.LongToIntFunction;
import java.util.jar.Attributes.Name;

class Main{
    // Every Line of code that runs in java be inside a class. 


    // Variables in java 
    // String = "Dinesh"
    // int = 1
    // boolean = flase/true
    // float = 1f
    // char = 'c'
    // long = 1l
    // double = 1.000

    String name = "Dinesh";
    int a = 1;
    boolean b = false;
    char c = 'c';
    float f = 1f;
    long l = 1l;
    double d = 1.0;


    // Making variable read-only use "final" or "constant" 
    // keyword before variable name


   static String newName = "Raju"; // "static" keyword used for accessible in 
   // static method

   final static String oldName = "OldName";
    
    static long ab = 2;
    static char cd = 92;

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;
            }
            System.out.println(i);
          }
        
    }

    

}