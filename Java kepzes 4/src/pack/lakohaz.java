package pack;

import java.util.Comparator;

public class lakohaz implements Comparable<lakohaz> {

    public static final double EMELET_MAGASSAG=3.2;
    private String cim;
    private int emeletekSzama;
    private double alapterulet;

    public String getCim() {
        return cim;
    }

    public int getEmeletekSzama() {
        return emeletekSzama;
    }

    public double getAlapterulet() {
        return alapterulet;
    }

    public lakohaz(String cim, int emeletekSzama, double alapterulet) {
        this.cim = cim;
        this.emeletekSzama = emeletekSzama;
        this.alapterulet = alapterulet;
    }
    public double legkobmeter(){
        return alapterulet*emeletekSzama*EMELET_MAGASSAG;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(cim).append(" - ");
        sb.append(alapterulet).append(" - ").append(emeletekSzama);
        return sb.toString();
    }

    @Override
    public int compareTo(lakohaz o) {
        if (legkobmeter() > o.legkobmeter())
            return 222;
        else if (legkobmeter()<o.legkobmeter())
            return -222;
        return 0;
    }
}
