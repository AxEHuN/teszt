public class VendéglátóIE {
    private String nev;
    private int ferohelyek_Szama;
    private boolean dohanyzike;

    public VendéglátóIE(String nev, int ferohelyek_Szama, boolean dohanyzike) {
        this.nev = nev;
        this.ferohelyek_Szama = ferohelyek_Szama;
        this.dohanyzike = dohanyzike;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyek_Szama() {
        return ferohelyek_Szama;
    }

    public boolean isDohanyzike() {
        return dohanyzike;
    }

    public void setDohanyzike(boolean dohanyzike) {
        this.dohanyzike = dohanyzike;
    }

    @Override
    public String toString() {
        return "{" +
                "Nev='" + nev + '\'' +
                ", Ferohelyek=" + ferohelyek_Szama +
                ", Cigizik? =" + dohanyzike +
                '}';
    }
}
