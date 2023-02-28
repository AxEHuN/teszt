public class Hallgato {
    private int evfolyam;
    private String nev;
    private String nkod;
    private double atlag;
    private boolean nappali;

    public  Hallgato(){}

    public Hallgato(int evfolyam, String nev, String nkod, double atlag, boolean nappali) {
        this.evfolyam = evfolyam;
        this.nev = nev;
        this.nkod = nkod;
        this.atlag = atlag;
        this.nappali = nappali;
    }

    public int getEvfolyam() {
        return evfolyam;
    }

    public void setEvfolyam(int evfolyam) {
        this.evfolyam = evfolyam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNkod() {
        return nkod;
    }

    public void setNkod(String nkod) {
        this.nkod = nkod;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    public boolean isNappali() {
        return nappali;
    }

    public void setNappali(boolean nappali) {
        this.nappali = nappali;
    }
}
