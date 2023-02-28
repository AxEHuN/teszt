import java.util.Arrays;

public class kocsma extends  VendéglátóIE{
    private String[] sorlap;

    public kocsma(String nev, int ferohelyek_Szama, boolean dohanyzike, String[] sorlap) {
        super(nev, ferohelyek_Szama, true);
        this.sorlap = sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "kocsma{" +
                "sorlap= " + Arrays.toString(sorlap) +
                '}' + super.toString();
    }
}
