public class Runner {
    public static void main(String[] args) {
        MyThread mThread = new MyThread(0);
        Thread FirstThread = new Thread(mThread);
        FirstThread.start();

        mThread = new MyThread(1);
        Thread SecondThread = new Thread(mThread);
        SecondThread.start();

        mThread = new MyThread(2);
        Thread ThirdThread = new Thread(mThread);
        ThirdThread.start();

    }
}
