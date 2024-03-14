package Basics;

public class publictest {
    public static void main(String[] args) {
    oopsConcept op = new oopsConcept();
    op.ram();
    printHello();
    }
    protected static void printHello(){
        System.out.println("Hello Laxman");
    }
}

//class privateTest{
//    public void callHello(){
//        publictest.printHello();
//    }
//}
class publicTestAgain extends publictest{

}
