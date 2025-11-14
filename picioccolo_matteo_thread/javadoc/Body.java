/**
 * Thread che rappresenta il corpo del trapano.
 * Simula il processo di assemblaggio del body con sleep().
 */
public class Body extends Thread {

    private boolean assembled = false;

    /**
     * Restituisce true se il body è stato assemblato.
     * @return boolean
     */
    public boolean isAssembled() {
        return assembled;
    }

    /**
     * Metodo eseguito dal thread.
     * Simula l'assemblaggio del corpo con sleep() e aggiorna il flag.
     */
    @Override
    public void run() {
        try {
            System.out.println("Body: assembling body...");
            Thread.sleep(600);
            assembled = true;
            System.out.println("Body: body completed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
