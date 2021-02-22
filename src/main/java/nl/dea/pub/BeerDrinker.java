package nl.dea.pub;

public class BeerDrinker {

    private final String name;
    private final Keg keg;

    private int consumedBeer = 0;

    public BeerDrinker(String name, Keg keg) {
        this.keg = keg;
        this.name = name;
    }

    public void startDrinking() {
        while (keg.getRemainingVolume() > 0) {
            consumedBeer += keg.tap(200);
            System.out.println(this.name + " tapped a glas.");
        }

        System.out.println(this.name + " drank " + consumedBeer + "ml.");

    }
}
