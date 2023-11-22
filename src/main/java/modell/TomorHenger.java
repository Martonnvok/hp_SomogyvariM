package modell;

public class TomorHenger extends Henger {

    private double fajsuly;

    public TomorHenger(double sugar, double magassag, double fajsuly) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
    }

    public double getFajsuly() {
        return fajsuly;
    }

    public double suly() {
        return fajsuly * 2;
    }

    @Override
    public String toString() {
        return "fajsuly: " + this.fajsuly;
    }
}
