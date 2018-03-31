package JavaTutorialForBeginners;

public class Orc {
    
    private int height;  //this is the class level variable and this need to be encapsulated
    
    public void setHeight (int height) {  //NOTE: the word "height" nect to int is just a placeholder. We could have called it anything.
       
        if (height < 10) {
            this.height = height;
            System.out.println("Orc met the criteria"); 
        }
        else {
            System.out.println("Please enter a height under 10 feet!"); 
        }
    }        
    
    
    public int getHeight () {
        return height;
    }
    
/*
    The method below will not be used as is, since it is not protected by someone else using it in a way that would cause issues. For example,
    a programmer may not be aware of this method or how it was meant to be used, so inadvertantly calls the methos and passes parameters
    that would cause problems. The idea is that we have to use GETTERS/SETTERS to avaoid misuse of what the methos was intended to do.
    
    
    public int getHeight (int x) {
       
        this.height = x;
        return height;
    }
*/
}
