package JavaTutorialForBeginners;

public class ErrorHandlingUsingFinally {

    public static void main(String[] args) {
       
        try {

            int x = 1/0;
            int [] testArray = new int [3];
        
            testArray[0] = 1; 
            testArray[1] = 2;
            testArray[2] = 3;
            
            System.out.println(x);
            System.out.println(testArray[99]);
        
        
        } catch  (IndexOutOfBoundsException er) {
            System.out.println("An OOB Exception");
        } catch   (Exception er) {
            System.out.println("An Exception occurred");
        } finally {
            //This code will run no matter what.
                int [] testArray = new int [3];
        
                testArray[0] = 1; 
                testArray[1] = 2;
                testArray[2] = 3;
            
                
                System.out.println(testArray[1]);

        }
        
    }    
}
