public class SemaforoNorteSur extends Thread {

    semaforosDistrital t;

    public SemaforoNorteSur(semaforosDistrital t) {
        this.t = t;

    }

    public synchronized void run() {
        while (true) {
            t.sema02();
            try {
                sleep(1000);

            } catch (InterruptedException e) {
            }



        }
    }
}