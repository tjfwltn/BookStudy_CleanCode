package 설지수.chapter13;

public class Main {
    public static void main(String[] args) {
        final X x = new X(42);

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                System.out.println(x.getNextId());
                x.getNextId();
            }
        };

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread.start();
        thread2.start();
    }
}
