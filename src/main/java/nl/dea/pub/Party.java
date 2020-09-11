package nl.dea.pub;

import java.util.ArrayList;

public class Party {

    public static void main(String[] args) {

        // Initialize new Grolsch keg with 50l
        var grolsch = new Keg(50000);

        // Create the drinkers
        var drinkers = new ArrayList<BeerDrinker>();

        drinkers.add(new BeerDrinker("Meron", grolsch));
        drinkers.add(new BeerDrinker("Robin", grolsch));
        drinkers.add(new BeerDrinker("Koen", grolsch));
        drinkers.add(new BeerDrinker("Leon", grolsch));
        drinkers.add(new BeerDrinker("Anne", grolsch));

        // Create and start the threads
        drinkers.forEach(drinker -> new Thread(drinker).start());
    }
}
