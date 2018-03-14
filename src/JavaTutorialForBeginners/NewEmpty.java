package JavaTutorialForBeginners;

public class NewEmpty {

int x = 10;
int y = 11;


/* Below are exampples of explicit and implicit constructors. They are in different positions of the program, but they 
do exactly the same thing. If I run this program now, my output will be 21.
*/


public NewEmpty () {  //This is an explicit constructor
    
}


    public static void main(String[] args) {
        
        NewEmpty test = new NewEmpty ();  //default implicit constructor
        
        System.out.println(test.x + test.y);
        
        
    }
        
        




    
}
