//Converting info to a new form is called casting. There are 4 types: variable to variable, object to object, variable to object, object to variable
public class Casting {
    
    public static void main(String[] args) {
        
        //1st type: variable to variable
        //decimal to whole number
       
        double source1 = 150.999999999;
        double source2 = 150.99999999999999;
        int destination1 = (int) source1; //This is explicit casting
        int destination2 = (int) source2; //This is explicit casting

        System.out.println("---------------------------");        
        System.out.println(source1); //Just shows the value of source1
        System.out.println(destination1); //Java rounded source1 DOWN and truncated the decimal to be 150
        System.out.println("---------------------------");
        System.out.println(source2); //....but rounded this UP from the start to 151.0
        System.out.println(destination2); //The decimal was just truncated here to be 151

        System.out.println("---------------------------");
        System.out.println("Object to variable casting example. The 400 is now an object");       
        //object to variable
        Integer wholeNumber = new Integer (400); //This is an object, which is wholeNumber
        int dest = wholeNumber.intValue();       //This is a variable
        System.out.println(dest);        

        System.out.println("---------------------------");
        System.out.println("variable to object casting example. The 47 is now a string 47");        

        //variable to object
        String val = "47"; //this is the variable
        int intObject = Integer.parseInt(val); //this is the object
        System.out.println(intObject);  
        
        System.out.println("---------------------------"); 
        System.out.println("Implicit casting example");
        //Implicit casting example
        int x = 47;
        double y = 3.5;
        double xy = x + y;
        System.out.println(xy); //upon execution, Java converts the x variable to a double 
        
        
        
        
    }
    
    
    
}