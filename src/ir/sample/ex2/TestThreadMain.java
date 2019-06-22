package ir.sample.ex2;


public class TestThreadMain {

    public static void main(String[] args) {

        Thread t1 = new TestThread ("T1");
        t1.start();

        Thread t2 = new TestThread ("T2");
        t2.start();
    }

}
