public class MyThread implements Runnable{
    private int Status;

    public MyThread(int status){
        this.Status = status;
    }

    @Override
    public void run() {
        while (ThreadTask.OperationsNumber < 50){
            switch (this.Status) {
                case 0 -> ThreadTask.digitsToSymbol();
                case 1 -> ThreadTask.spacesToSymbol();
                case 2 -> ThreadTask.printResults();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
