package Revature.Class6;

class GuruThread3 implements Runnable{

    Thread gthread;
    private String gname;

    GuruThread3() {
    }

    GuruThread3(String name) {
        gname = name;
    }

    @Override
    public void run() {
        System.out.println("Thread running" + gname);
        for (int i=0 ; i<4 ; i++) {
            System.out.println(i);
            System.out.println(gname);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("THread has been interrupted");
            }
        }
    }

    public void start() {
        System.out.println("Thread started");
        if (gthread == null) {
            gthread = new Thread(this, gname);
            gthread.start();
        }
    }
}

public class GuruThread2 {
    public static void main(String[] args) {
        GuruThread3 gt1 = new GuruThread3("guru1");
        gt1.start();
        GuruThread3 gt2 = new GuruThread3("guru2");
        gt2.start();
    }

}
