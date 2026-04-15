class MyTask implements Runnable {
    private int id;
    MyTask(int id) {
        this.id = id;
    }
    public void run() {
        try {
            System.out.println("Thread " + id + " started");
            if (id % 2 == 0) {
                throw new Exception("Error in thread " + id);
            }
            System.out.println("Thread " + id + " completed successfully");
        } catch (Exception e) {
            System.out.println("Exception caught in thread " + id + ": " + e.getMessage());
        }
    }
}
public class lab {
    public static void main(String[] args) {
        Thread[] threads = new Thread[5];
        for (int i = 1; i <= 5; i++) {
            threads[i - 1] = new Thread(new MyTask(i));
            threads[i - 1].start();
        }
        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }
        System.out.println("All threads finished.");
    }
}