package nl.dea.pub;

public class BeerDrinker implements Runnable {

    private static final int VOLUME_GLAS = 200;
    private final String name;
    private final Keg keg;

    private int consumedBeer = 0;

    public BeerDrinker(String name, Keg keg) {
        this.keg = keg;
        this.name = name;
    }

    public void startDrinking() {
        while (keg.getRemainingVolume() > 0) {
            consumedBeer += keg.tap(VOLUME_GLAS);
            System.out.println(this.name + " tapped a glas.");
            try {
                // drink
                Thread.sleep(20);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(this.name + " drank " + consumedBeer + "ml.");

    }

    public void run() {
        startDrinking();
    }
}
