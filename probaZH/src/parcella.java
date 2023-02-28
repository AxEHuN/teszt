public class parcella {
    private int helyrajziszam;
    private Szolofajta szolofajta;
    private int tokeszam;
    private Evestermes evestermes;

    public parcella() {
    }

    private class Evestermes {
        public int ev;
        public int ossztermes;
        public double atlagostermes;

        public Evestermes(int ev, int ossztermes, double atlagostermes) {
            this.ev = ev;
            this.ossztermes = ossztermes;
            this.atlagostermes = ossztermes/tokeszam;;
        }

        public int getEv() {
            return ev;
        }

        public void setEv(int ev) {
            this.ev = ev;
        }

        public int getOssztermes() {
            return ossztermes;
        }

        public void setOssztermes(int ossztermes) {
            this.ossztermes = ossztermes;
        }

        public double getAtlagostermes() {
            return atlagostermes;
        }

        public void setAtlagostermes(double atlagostermes) {
            this.atlagostermes = atlagostermes;
        }
    }

    public parcella(int helyrajziszam, Szolofajta szolofajta, int tokeszam, Evestermes evestermes) {
        this.helyrajziszam = helyrajziszam;
        this.szolofajta = szolofajta;
        this.tokeszam = tokeszam;
        this.evestermes = evestermes;
    }

    public void setEvestermes(Evestermes evestermes) {
        this.evestermes = evestermes;
    }

    public int getHelyrajziszam() {
        return helyrajziszam;
    }

    public void setHelyrajziszam(int helyrajziszam) {
        this.helyrajziszam = helyrajziszam;
    }

    public Szolofajta getSzolofajta() {
        return szolofajta;
    }

    public void setSzolofajta(Szolofajta szolofajta) {
        this.szolofajta = szolofajta;
    }

    public int getTokeszam() {
        return tokeszam;
    }

    public void setTokeszam(int tokeszam) {
        this.tokeszam = tokeszam;
    }

    public Evestermes getEvestermes() {
        return evestermes;
    }
}

