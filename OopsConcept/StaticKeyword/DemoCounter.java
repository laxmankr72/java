package OopsConcept.StaticKeyword;

public class DemoCounter {
    public static void main(String[] args) {

        Counter cntr = new Counter();
        cntr.increment();
        cntr.increment();
        cntr.increment();
        cntr.increment();
        cntr.increment();

        Counter cntr1 = new Counter();
        cntr1.increment();
        cntr1.increment();
        cntr1.increment();
        cntr1.increment();
        cntr1.increment();

        Counter cntr2 = new Counter();
        cntr2.increment();
        cntr2.increment();
        cntr2.increment();
        cntr2.increment();
        cntr2.increment();

        System.out.println(cntr2.getCount());
    }
}
