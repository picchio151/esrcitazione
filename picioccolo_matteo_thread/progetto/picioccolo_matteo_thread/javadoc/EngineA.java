/**
 * Thread che rappresenta il motore del trapano.
 * Simula il processo di assemblaggio del motore con sleep().
 */
public class EngineA extends Thread {

    private boolean assembled = false;

    /**
     * Restituisce true se il motore è stato assemblato.
     * @return boolean
     */
    public boolean isAssembled() {
        return assembled;
    }

    /**
     * Metodo eseguito dal thread.
     * Simula l'assemblaggio del motore con sleep() e aggiorna il flag.
     */
    @Override
    public void run() {
        try {
            System.out.println("EngineA: assembling engine...");
            Thread.sleep(800);
            assembled = true;
            System.out.println("EngineA: engine completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
