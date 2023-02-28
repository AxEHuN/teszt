import java.util.Objects;

public class Szemely {
    protected String nev;
    protected int eletkor;
    private boolean ferfi;

    public Szemely(String nev, int eletkor, boolean ferfi) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.ferfi = ferfi;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public boolean isFerfi() {
        return ferfi;
    }

    public void setFerfi(boolean ferfi) {
        this.ferfi = ferfi;
    }

    @Override
    public String toString() {
        return
                "nev=" + nev +
                ", eletkor=" + eletkor +
                ", ferfi=" + ferfi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Szemely szemely = (Szemely) o;
        return eletkor == szemely.eletkor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eletkor);
    }
}
