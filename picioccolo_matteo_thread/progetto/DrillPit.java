public class DrillPit extends Thread {

    private boolean assembled = false;

    public boolean isAssembled() {
        return assembled;
    }

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
