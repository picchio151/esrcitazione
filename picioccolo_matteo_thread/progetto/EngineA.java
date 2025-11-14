public class EngineA extends Thread {

    private boolean assembled = false;

    public boolean isAssembled() {
        return assembled;
    }

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
