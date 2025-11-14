/**
 * Thread che rappresenta la punta del trapano.
 * Simula il processo di assemblaggio della punta con sleep().
 */
public class DrillPit extends Thread {

    private boolean assembled = false;

    /**
     * Restituisce true se la punta del trapano è stata assemblata.
     * @return boolean
     */
    public boolean isAssembled() {
        return assembled;
    }

    /**
     * Metodo eseguito dal thread.
     * Simula l'assemblaggio della punta con sleep() e aggiorna il flag.
     */
    @Override
    public void run() {
        try {
            System.out.println("DrillPit: forging the drill tip...");
            Thread.sleep(700);
            assembled = true;
            System.out.println("DrillPit: drill tip ready!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
