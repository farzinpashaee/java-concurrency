package ir.sample.runnable;

public class TestRunnableMain {

    public static void main(String[] args) {

        Thread t1 = new Thread (new TestRunnable("T1"), "TreadName1");
        t1.start();

        Thread t2 = new Thread (new TestRunnable("T2"), "TreadName2");
        t2.start();
    }

}
