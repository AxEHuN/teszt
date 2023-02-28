package vendeglatas;

import ital.Ital;
import ital.ItalBolt;
import ital.SzeszesItal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kocsma implements ItalBolt {
    private String kocsmanev;
    private List<Ital> italok;

    public Kocsma(String kocsmanev, List<Ital> italok) {
        this.kocsmanev = kocsmanev;
        this.italok = italok;
    }
    public String getItalok(){
        StringBuilder sb = new StringBuilder();
        for (Ital ital : italok) {
            sb.append(ital);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void hozzáad(Ital ital) {
    italok.add(ital);
    }

    @Override
    public int összÉrték() {
        int ossz=0;
        for (Ital ital : italok) {
            ossz+=ital.getAr();
        }
        return ossz;
    }

    @Override
    public List<SzeszesItal> erősPiák(double limit) {
        List<SzeszesItal> szital = new ArrayList();
        for (int i=0;i<italok.size();i++) {
            if (italok.get(i) instanceof SzeszesItal && ((SzeszesItal) italok.get(i)).getAlkoholtartalom()>limit) {
                szital.add((SzeszesItal) italok.get(i));
            }
        }
        Collections.sort(szital, new Comparator<SzeszesItal>() {
            @Override
            public int compare(SzeszesItal o1, SzeszesItal o2) {
                if (o1.getAlkoholtartalom() > o2.getAlkoholtartalom()) return 1;
                if (o1.getAlkoholtartalom() < o2.getAlkoholtartalom()) return -1;
                return 0;
            }
        });
        return szital;
    }

    @Override
    public String toString() {
        return kocsmanev +"\n" + getItalok();
    }

    public double atlagAr(boolean bool) throws NincsElégPiaException {
        double avg = 0;
        int db = 0;
        if (italok.size()==0) throw new NincsElégPiaException();
        else {
            if (bool == true) {
                for (int i = 0; i < italok.size(); i++) {
                    if (italok.get(i) instanceof SzeszesItal) {
                        avg += italok.get(i).getAr();
                        db++;
                    }
                }
            } else if (bool == false) {
                for (int i = 0; i < italok.size(); i++) {
                    if (italok.get(i) instanceof Ital && !(italok.get(i) instanceof SzeszesItal)) {
                        avg += italok.get(i).getAr();
                        db++;
                    }
                }
            }
        }
    return avg/db;
    }//end of atlagAr

    }//end of

