import java.io.*;

public class Fib {
    public static long[]array;
    public static long fib(int n){
        if (array[n] != 0){
            return array[n];
        }
        array[n] = fib(n-1) + fib(n-2);
        return array[n];
    }
    public static void main(String[] args){
        array = new long[1000000000];
        for (int i = 0; i<1000000000; i++){
            array[i] = 0;
        }
        array[0] = array[1] = 1;
        for (int i = 0; i<1000000000; i++){
            //System.out.println(fib(i));
            long n = fib(i);
            if (i == 999999999){
                System.out.println(Math.pow(2,63)-1-n);
            }
        }
    }
}
