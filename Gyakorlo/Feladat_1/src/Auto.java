import java.util.Objects;

public class Auto {
    private String rendszam;
    private int teljesitmeny;
    private boolean automata;
    private int count;

    public Auto(String rendszam, int teljesitmeny, boolean automata) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
        count++;
    }

    public int getCount() {
        return count;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Rendszam: " +   rendszam + " teljesitmeny: " + teljesitmeny + " automata:" + automata +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(rendszam, auto.rendszam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rendszam, teljesitmeny, automata);
    }

    public boolean isNagyobb(int telj){
        return this.teljesitmeny>telj;
    }

    public boolean isSzabalyos(Auto a){
        if (a.rendszam.length()==6
                &&(Character.isLetter(a.rendszam.charAt(0))
                && Character.isLetter(a.rendszam.charAt(1))
                && Character.isLetter(a.rendszam.charAt(2))
                && Character.isDigit(a.rendszam.charAt(3))
                && Character.isDigit(a.rendszam.charAt(4))
                && Character.isDigit(a.rendszam.charAt(5)))) {
            return true;
        }else{
            return false;
        }
    }


}
