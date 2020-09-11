package nl.dea.pub;

public class Keg {

    private int remainingCapacityInMl;

    public Keg(int capacityInMl) {
        this.remainingCapacityInMl = capacityInMl;
    }

    public int getRemainingVolume() {
        return this.remainingCapacityInMl;
    }

    public synchronized int tap(int volumeInMl) {
        if (volumeInMl > this.remainingCapacityInMl) {
            volumeInMl = this.remainingCapacityInMl;
        }

        this.remainingCapacityInMl -= volumeInMl;
        return volumeInMl;
    }
}
