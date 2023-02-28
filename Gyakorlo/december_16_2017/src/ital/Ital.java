package ital;

import java.util.Objects;

public class Ital {
    protected String megnevezes;
    protected String kiszereles;
    protected int ar;

    public Ital(String megnevezes, String kiszereles, int ar) {
        this.megnevezes = megnevezes;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    public void setKiszereles(String kiszereles) {
        this.kiszereles = kiszereles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ital ital = (Ital) o;
        return Objects.equals(megnevezes, ital.megnevezes) && Objects.equals(kiszereles, ital.kiszereles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(megnevezes, kiszereles);
    }

    @Override
    public String toString() {
        return "<" + megnevezes + ">, " + "<" + kiszereles + ">, "  +
                   "<" + ar + "> " + "FT"+'\n';
    }

}