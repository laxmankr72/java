package multithreading;


class Mythread extends Thread{

    public void run(){
        System.out.println("run method executed by thrad : "+Thread.currentThread().getName());
    }
}

public class ThreadName {
    public static void main(String[] args) {

        Mythread mt = new  Mythread();
        mt.start();

        System.out.println("Main method executed by thrad : "+Thread.currentThread().getName());
    }
}
