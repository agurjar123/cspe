/**
 * identifiers are variables, parameters, constants, user methods, or user classes
 * may not begin with a digit and are case sensitive
 * illegal identifier: 13age
 * uses camel case for variables and methods: areaSquare
 * uses pascal case for class names: AreaSquare
 */ 

public class TypesAndIdentifiers{
    public static void builtInTypes(String[]args){
        int age = 15; //if value exceeds integer max or min--> will overflow / max and min are 2^31 -1 and 2^-31-1
        boolean alive = true;
        double bankBalance = 1000.00;
        
        int x, y; //don't have to initialize value and can create many variables on same line
        int a = 1, b = 0;

        int integer = 1;
        double doub = 2.00;
        //can cast one type to another compatible type
        double quotient = (double) integer/doub;
        System.out.println(quotient);
        int num = 5;
        //also can implicitly int to double
        double num1 = num;
        System.out.println(num1);
        //however you cannot implicitly cast a double to an int
        double val = 5.45;
        //int realVal = val; //causes error
        int realVal = (int) (val+.5); //add .5 to round positive numbers and can subtract .5 to round negative numbers
        System.out.println(realVal);
    }
    public static void storageOfNumbers(){
        //integers stored as string of bits with first bit denoting positive or negative (0 or 1)
        //identifier type byte uses 8 bits --> largest byte storable is 2^7 -1
        //int type uses 32 bit, 4 byte --> largest integer storable is 2^31 -1
        //Integer is int class
        //type long is 8 bytes --> largest long storable is 2^63 -1

        //float uses 4 bytes and double uses 8
        //floats are stored in 2 parts --> mantissa -> digits of number and exponent
        //sign*mantissa*2^n
        //2 = radix or base
        //in type double -> 11 bits for exponent and 52 bits for mantissa
        //floats converted to binary which leads to rounding errors
        double op1 = 0.1*26;
        double op2 = 0;
        for (int i=0;i<=20;i++){
            op2 = op2+0.1;
        }
        System.out.println(op1);
        System.out.println(op2);

        //when performing operation that results in undefined results, java returns NaN
            //for example 0.0/0.0
        System.out.println(0.0/0.0);
        //returns Infinity or Negative Infinity when dviiding by 0 or any other operation that results in infinitely small or large number
        System.out.println(10/0.0);
    }

    public static void finalVariables(){
        //variable that won't change value
        final boolean X = true;
        //x = false; results in error
        //final variables written in all caps with underscore
        final int WHY_AM_I_DOING_THIS = 25;
        //can be declared and used w/o intializing
        final int VALUE;
        if ( X == true){
            VALUE = 1;
        }
        int[] classList = new int[25];
        System.out.println(classList);    
    }
    public static void arithmeticOperators(){
        //cross type int and double
        //int promoted to double and returns double
        System.out.println(10%3);
        //usually follow order of operations but if all operations on same line, then follows in the order left to right
        System.out.println(20+3/3*8%4+3);
    }
    public static void logicalOperators(){
        //! is not, && is and, || is or
        //evaluates left to right and can stop after first evaluation
    }
    public static void assignmentOperators(){
        int x = 1230490237;
        for (int i = 0; i<20; i++){
            x %= 23;
            System.out.print(x + " ");
        }
    }
    public static void controlStructures(){
        //nesting equal to &&
        boolean BOOL = true;
        if (BOOL ==true){
            if (BOOL != false){
                System.out.println(BOOL);
            }
        }
        if (BOOL == true && BOOL != true){
            System.out.println(BOOL);
        }
        int[] j = new int[30];
        for (int i : j){
            j[i] = i;
            System.out.println(j[i]);
        }
        int k = 0;
        int l = 20000;
        while (k < l){
            k ++;
        }
        System.out.println(k);
        //create sentinel
        final int SENTINEL = -999;
        //add to end of part of array and then you can terminate loop when sentinel is reached

    }
    public static void errorsAndExceptions(){
        /**
         * ArithmeticException
         * NullPointerException
         * ArrayIndexOutOfBoundsException
         * IndexOutOfBoundException
         * IllegalArgumentException
         * NoSuchElementException
         * ClassCastException
         */
    }
    public static void multipleChoiceChapter1(){
        double x = 14.7;
        //int y = x; //throws error
        int y = (int) x;
        int x1 = 14;
        double y1 = x1;

        System.out.println(13-((3*6/4)%3));
        System.out.println(3*6/4);
        /**
         * #1 is ? //WRONG B
         * #2 is E
         * #3 is C
         * #4 is D
         * #5 is E
         * #6 is ? //WRONG E
         * #7 is C
         * #8 is B
         * #9 is D
         * #10 is E //WRONG D
         * #11 is A
         * #12 is D //WRONG C
         * #13 is D
         * #14 is E //WRONG A
         * #15 is C
         * #16 is A
         * #17 is ? //WRONG D
         * #18 is A
         * #19 is C
         * #20 is D
         * #21 is D
         * #22 is D //WRONG B
         * #23 is A //WRONG C
         * #24 is B
         * #25 is D //WRONG E
         * #26 is ? //WRONG D
         * #27 is A //WRONG A
         */
    
    }
    public static void main(String[]args){
        storageOfNumbers();
        finalVariables();
        arithmeticOperators();
        assignmentOperators();
        controlStructures();
        errorsAndExceptions();
        multipleChoiceChapter1();
    }
}