/**
 * Classe principale che rappresenta un trapano.
 * Coordina i thread figli: Body, EngineA e DrillPit.
 * Il trapano può scavare solo quando tutti i componenti sono assemblati.
 */
public class Drill extends Thread {

    /**
     * Metodo eseguito dal thread principale.
     * Avvia i thread figli, li attende con join e poi esegue lo scavo.
     */
    @Override
    public void run() {

        Body body = new Body();
        EngineA engine = new EngineA();
        DrillPit tip = new DrillPit();

        System.out.println("Drill: starting full assembly...");

        body.start();
        engine.start();
        tip.start();

        try {
            body.join();
            engine.join();
            tip.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Drill: all components assembled. Starting digging process...");
        dig();
    }

    /**
     * Simula l'azione di scavare.
     * Viene eseguita solo dopo che tutti i componenti sono assemblati.
     */
    private void dig() {
        try {
            System.out.println("Drill: digging...");
            Thread.sleep(600);
            System.out.println("Drill: digging completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
