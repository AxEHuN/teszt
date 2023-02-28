public class Evestermes extends Parcella{
    private int ev;
    private double ossztermes;
    private double avgtermes;

    public Evestermes(int ev, double ossztermes) {
        this.ev = ev;
        this.ossztermes = ossztermes;
        this.avgtermes = 0;
    }
    public Evestermes() {
    }


    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public double getOssztermes() {
        return ossztermes;
    }

    public void setOssztermes(double ossztermes) {
        this.ossztermes = ossztermes;
    }

    public double getAvgtermes() {
        return avgtermes;
    }

    public void setAvgtermes(double avgtermes) {
        this.avgtermes = avgtermes;
    }

    @Override
    public String toString() {
        return "Evestermes{" +
                "ev=" + ev +
                ", ossztermes=" + ossztermes +
                ", avgtermes=" + avgtermes +
                '}';
    }
}
