package JavaTutorialForBeginners;

public class This {

    private int one;    //Object or Instance vaiable
    
    public This (int x) {  //This is the constructor
        one = x;    //Local variable
    }
    
    public static void main(String[] args) {
        
        This testThis = new This (79);
        
        System.out.println (testThis.one);
        
    }


    
}
