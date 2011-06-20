public class SemaforoEsteOeste extends Thread {

    semaforosDistrital t;

    public SemaforoEsteOeste(semaforosDistrital t) {
        this.t = t;
    }

    public synchronized void run() {

        t.sema01();

        try {
            sleep(1000);


        } catch (InterruptedException e) {
        }

    }
}