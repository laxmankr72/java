package ExceptionHandling;

public class NullPointer {
    public static void main(String[] args) {

        String str = null;

        try{
            System.out.println(str.length());
        }
        catch (NullPointerException e){

            System.out.println(e.getMessage());
        }
        System.out.println("Program End!!");
    }
}
