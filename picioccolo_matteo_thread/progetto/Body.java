public class Body extends Thread {

    private boolean assembled = false;

    public boolean isAssembled() {
        return assembled;
    }

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
