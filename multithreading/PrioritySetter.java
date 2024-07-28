package multithreading;

// This class defines a thread by extending the Thread class
class ChildThread extends Thread {

    // The run method contains the code that constitutes the new thread's task
    public void run() {
        // Loop to print "Child Thread" 100 times
        for(int i = 0; i < 100; i++) {
            System.out.println("Child Thread");
        }
    }
}

// The main class to demonstrate setting thread priorities
public class PrioritySetter {

    public static void main(String[] args) {

        // Set the priority of the main thread to 8
        Thread.currentThread().setPriority(8);

        // Create an instance of ChildThread
        ChildThread c = new ChildThread();

        // Set the priority of the child thread to 9
        c.setPriority(9);

        // Start the child thread
        c.start();

        // Loop to print "Main Thread" 100 times
        for(int i = 0; i < 100; i++) {
            System.out.println("Main Thread");
        }
    }
}
