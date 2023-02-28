public class Parcella {
    private int helyrajziszam;
    private Szolofajta szolo;
    private int tokeszam;
    Evestermes termes;

    public Parcella(int helyrajziszam, Szolofajta szolo, int tokeszam, Evestermes termes) {
        this.helyrajziszam = helyrajziszam;
        this.szolo = szolo;
        this.tokeszam = tokeszam;
        this.termes = termes;
        termes.setAvgtermes(tokeszam/ termes.getOssztermes());
    }

    public Parcella(int helyrajziszam, Szolofajta szolo, int tokeszam) {
        this.helyrajziszam = helyrajziszam;
        this.szolo = szolo;
        this.tokeszam = tokeszam;
        this.termes = new Evestermes();
    }

    public Parcella() {
    }

    public int getHelyrajziszam() {
        return helyrajziszam;
    }

    public void setHelyrajziszam(int helyrajziszam) {
        this.helyrajziszam = helyrajziszam;
    }

    public Szolofajta getSzolo() {
        return szolo;
    }

    public void setSzolo(Szolofajta szolo) {
        this.szolo = szolo;
    }

    public int getTokeszam() {
        return tokeszam;
    }

    public void setTokeszam(int tokeszam) {
        this.tokeszam = tokeszam;
    }

    public Evestermes getTermes() {
        return termes;
    }

    public void setTermes(Evestermes termes) {
        this.termes = termes;
    }

    @Override
    public String toString() {
        return
                "helyrajziszam=" + helyrajziszam +
                ", szolo=" + szolo +
                ", tokeszam=" + tokeszam +
                ", termes=" + termes +
                + '\n';
    }
}
