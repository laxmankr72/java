package ExceptionHandling;

import java.sql.SQLOutput;

public class AthMaticException {
    public static void main(String[] args) {
        System.out.println("main metod Started");
        int a=100;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by Zero(0)");
        }
        System.out.println("main metod ended");
    }
}
