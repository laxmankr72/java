package multithreading;


class ThreadJob extends Thread{
    public void run(){
        for (int i=0; i<20;i++){
            System.out.println("child thread Printing times "+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {    // main method

        ThreadJob tj = new ThreadJob();
        tj.start();              // the start() method moves the thread to the active state

        for (int i=0; i<20;i++){
            System.out.println("parent thread Printing times "+i);
        }
    }

}
