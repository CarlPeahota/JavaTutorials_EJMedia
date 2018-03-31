package JavaTutorialForBeginners;

public class LiteralValue {
    
    private int x;

    public LiteralValue () {  //This is the constructor
        x = 50;
    }

    public int methodChildClass () {
        x = 15;
        return x;
    }
    
    public int methodChildClass1 (int placeholder) {
        this.x = this.x + placeholder;  //this.x refers to the class level variable above (x = 50) 
        return x;
    }  

    public static void main(String[] args) {
      LiteralValue testObj = new LiteralValue();
      //NOTE: if you switch the order of these, you will get different results. The order below gives 15 and 60, but switched gives 95 and 15
      //That is because the methodChildClass overrides the value of x in the LiteralValue class (which was 50) to a new value of 15.
      //If the callouts below were switched, the override would not happen.
      System.out.println(testObj.methodChildClass());  
      System.out.println(testObj.methodChildClass1(45));
    }

}