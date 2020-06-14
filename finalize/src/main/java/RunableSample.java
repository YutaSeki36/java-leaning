public class RunableSample {
    private static class MyThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                System.out.println(i + ":" + this.hashCode());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        t1.start();
        t2.start();
    }
}
