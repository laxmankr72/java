package Basics;

public class oopsConcept {
    public static void main(String[] args) {
        balance bc = new balance();
        int blnc = bc.getBal();
        System.out.println(blnc);
        bc.setBal(10203);
        int setbal = bc.getBal();
        System.out.println(setbal);
        oopsConcept op = new oopsConcept();
        op.ram();
        publicTestAgain pt = new publicTestAgain();
        pt.printHello();
    }

    public void ram(){
        System.out.println("Jai Shree Ram");
    }
}

 class balance{
    private int bal = 10000;

     public int getBal() {
         return bal;
     }

     public void setBal(int bal) {
         this.bal = bal;
     }
 }

