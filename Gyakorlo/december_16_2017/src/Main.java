import ital.Ital;
import ital.SzeszesItal;
import vendeglatas.Kocsma;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ital i1 = new Ital("Sör", "500 dl",500);
        Ital i2 = new Ital("Bor", "1 l",1000);
        Ital i3 = new SzeszesItal("Palinka", "2 l",2000, 25.0);
        Ital i4 = new SzeszesItal("Palinka2", "2 l",2500, 40.0);
        Ital i5 = new SzeszesItal("Palinka3", "2 l",3000, 20.0);
        Ital i6 = new SzeszesItal("Palinka4", "2 l",3500, 15.0);
        List<Ital> italok = new ArrayList<Ital>();
        italok.add(i1);
        italok.add(i2);
        italok.add(i4);
        italok.add(i5);
        italok.add(i6);
        Kocsma kocsma = new Kocsma("Kiscsiko", italok);
        kocsma.hozzáad(i3);
        System.out.println(kocsma.toString());
        System.out.println("Össz ár: " + kocsma.összÉrték());
        List<SzeszesItal> szeszesItals = kocsma.erősPiák(20);

        for (var i : szeszesItals){
            System.out.println(i.toString());

        }



    }
}