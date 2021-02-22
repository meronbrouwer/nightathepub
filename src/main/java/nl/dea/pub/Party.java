package nl.dea.pub;

public class Party {

    public static void main(String[] args) {

        // Initialize new Grolsch keg with 50l
        var grolsch = new Keg(50000);


        // Create the drinker
        var drinker = new BeerDrinker("Meron", grolsch);
        drinker.startDrinking();

    }
}
