package Basics;

public class method {
    public static void main(String[] args) {

        System.out.println("jai shree ram");
        method2 m = new method2();
        m.printshiyaram();

        method m1=new method();
        m1.printram();
        oddEven();
    }
    public void printram(){
        System.out.println("Jai Shree Ram");
    }
   static void oddEven(){

        int a = 10;
    for(int j=0;j<=a;j++){
            if(j%2==0){
                System.out.println("even"+j);
            }
            else{
                System.out.println("odd"+j);
            }
        }

    }


}
class method2{
    public void printshiyaram(){

        System.out.println("jai siya ram");
    }
}


