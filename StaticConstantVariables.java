public class StaticConstantVariables {
    static final int Test=1; //Alternatively, may write final static also
    
    final static int test3; //initializing constant within a static block
    static{
        test3 = 6;
    }
    
    //final static int Test4; 
    
    public static void main(String[] args) {
        //final static int test = 5;  compile error since static variable is declared within main
        //Test4 =6; compile error since static variable is initialized within main
        
        final int Test2 = 3; //declaring constant here is not recommended but no error will be produced
        
        System.out.println(Test);
        System.out.println(Test2);
        System.out.println(test3);
    }

}
