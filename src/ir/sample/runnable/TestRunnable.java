package ir.sample.runnable;

public class TestRunnable implements Runnable {

    private String name;

    public TestRunnable( String name ){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " -> start running" );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + name + ", " + i);
                Thread.sleep((long) Math.random()*2000 + 1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  name + " interrupted.");
        }
    }
}
