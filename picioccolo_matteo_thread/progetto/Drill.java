public class Drill extends Thread {

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
