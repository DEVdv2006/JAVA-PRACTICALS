class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread1");
            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds (1 second)
            } catch (InterruptedException e) {
                System.err.println("Thread1 interrupted: " + e.getMessage());
            }
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread2");
            try {
                Thread.sleep(2000); // Sleep for 2000 milliseconds (2 seconds)
            } catch (InterruptedException e) {
                System.err.println("Thread2 interrupted: " + e.getMessage());
            }
        }
    }
}

public class Practical25 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
    }
}

