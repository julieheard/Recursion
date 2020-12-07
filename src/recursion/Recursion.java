
package recursion;

public class Recursion {

    //The point of this project is to show the stack frame usage when using recursive or iterative method calls
    public static void main(String[] args) {
    
       printStackTrace();
       
        //easyCounter(0);
        
        //Counter(0);
    }

    public static void easyCounter(int a) {
        while (a != 10) {
            //printStackTrace();
            System.out.println(a);
            a = a + 1;
        }
    }

    public static void Counter(int a) {
        //printStackTrace();
        if (a != 10) {
            System.out.println(a);
            Counter(a + 1);
        }
    }

    /*
    This method is used to print the call stack. 
    Every time a method is called it is added to the call stack
    and removed when it is finished. This method itself adds two items
    for calling printStackTrace() and getStackTrace()
    */
    public static void printStackTrace() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.println("Printing stack trace, current length: " + elements.length);
        for (int i = 0; i < elements.length; i++) {
            StackTraceElement s = elements[i];
            System.out.println("\t at "
                    + s.getClassName() + "."
                    + s.getMethodName()
                    + "(" + s.getFileName() + ":" + s.getLineNumber() + ")");
        }
        System.out.println("\n");
    }

 
}
