package JavaTutorialForBeginners;

public class ErrorHandling {

    public static void main(String[] args) {
       
        try {
        
        int [] testArray = new int [3];
        
        testArray[0] = 1; 
        testArray[1] = 2;
        testArray[2] = 3;
       
        
       
       
        System.out.println(testArray[99]);
        
        
    } catch  (IndexOutOfBoundsException er) {
        System.out.println("An OOB Exception");
        }
        
        try {
        int x = 1/0;
        System.out.println(x);
        } catch   (ArithmeticException er) {
        System.out.println("An Arith Exception");
        }
    }
}
