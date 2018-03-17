package JavaTutorialForBeginners;


public class SubClass_26 extends SuperClass_26 {

    private int a;
    private int b;
    
    public SubClass_26 (int x, int y) { /* (2) This gets called, with the values "1" and "2" passed in, 
                                                                                but the super constructor, below, gets built FIRST by Java
                                                                     */ 
        super (3,4);  //The "super" constructor HAS TO BE positioned first, otherwise you get errors.
                                /* (3) The super constructor calls out to the SuperClass, because of the "extends".
                                            It passes "3", and "4" into SuperClass_26's "public  SuperClass_26 (int xx, int yy)"
                                            then assings them to SuperClass_26's "c" and "d" local variables. 
                                */
                               /* (4) Now SubClass_26 gets built using its parameters x = "1" and  y = "2"
                                            which now get assigned to "a" and "b"
                                */ 
        a = x;              
        b = y;
               
    }
    
    public static void main(String[] args) {
        SubClass_26 testSuper = new SubClass_26 (1,2);  /* (1) testSuper gets instantiated from a new version of the 
                                                                                                                  SubClass_26 class constructor, above, passing values of "1" and "2"
                                                                                                        */
                                                                                                        /* (4) Finally, the output is produced */
        System.out.println(testSuper.a);
        System.out.println(testSuper.b);
        System.out.println(testSuper.c);
        System.out.println(testSuper.d);
    }
    
}
