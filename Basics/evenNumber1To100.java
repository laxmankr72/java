package Basics;

public class evenNumber1To100 {
    public static void main(String[] args) {
        int a= 100;
        evenNumber(a);
    }
    public static void evenNumber(int a){

       for(int i=2;i<=a;i+=2){
               System.out.println("Number is Even : "+i);
           }
       }
    }

