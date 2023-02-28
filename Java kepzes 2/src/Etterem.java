import java.util.Arrays;

public class Etterem  extends VendéglátóIE{
    private String[] etlap;

    public Etterem(String nev, int ferohelyek_Szama, boolean dohanyzike, String[] etlap) {
        super(nev, ferohelyek_Szama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return super.toString() +
                " etlap=" + Arrays.toString(etlap) +
                '}';
    }
}
