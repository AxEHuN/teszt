import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Parcella> parcella1 = new ArrayList<Parcella>();
        parcella1.add(new Parcella(1,Szolofajta.Furmint,10000,new Evestermes(2016,1000.0)));
        parcella1.add(new Parcella(2,Szolofajta.Kékfrankos,20000,new Evestermes(2017,1200.0)));
        parcella1.add(new Parcella(3,Szolofajta.Furmint,50000,new Evestermes(2018,900.0)));
        parcella1.add(new Parcella(5,Szolofajta.Kékfrankos,30000,new Evestermes(2020,600.0)));

        parcella1.add(new Parcella(4,Szolofajta.Leányka,40000));


        Szolobirtok birtok1 = new Szolobirtok(parcella1);
        boolean exit = true;
        int choice = 0;
        while (exit){
            System.out.println("Menu" + '\n');
            System.out.println("1.Parcella hozzáadása!");
            System.out.println("2.Parcella hozzáadása helyrajzi szám alapján!");
            System.out.println("3.Parcella módosítás helyrajzi szám alapján!");
            System.out.println("4.Termés adat módosítása helyrajzi szám és évszám alapján!");
            System.out.println("5.Adatok kiirása");
            System.out.println("6.Kilépés");

            System.out.println("|");
            System.out.println("V");
            Scanner menu = new Scanner(System.in);
            int choice2 = menu.nextInt();
            switch (choice2){
                case 1:
                    System.out.println("Adatok bekérése. " + '\n');
                    birtok1.adatokBekerese();
                    break;
                case 2:
                    System.out.println("Add meg a helyrajzi számot: ");
                    Scanner helyrajzi = new Scanner(System.in);
                    int hely = helyrajzi.nextInt();
                    birtok1.termesiAdatFelvetel1(hely);
                    break;
                case 3:
                    System.out.println("Add meg a helyrajzi számot: ");
                    Scanner helyrajzi2 = new Scanner(System.in);
                    int hely2 = helyrajzi2.nextInt();
                    birtok1.termesiAdatFelvetel2(hely2);
                    break;
                case 4:
                    System.out.println("Add meg a helyrajzi számot: ");
                    Scanner helyrajzi3 = new Scanner(System.in);
                    int hely3 = helyrajzi3.nextInt();

                    System.out.println("Add meg az évet: ");
                    Scanner evsz = new Scanner(System.in);
                    int evszam = evsz.nextInt();
                    birtok1.termesModosit(hely3,evszam);
                    break;
                case 5:
                    birtok1.adatokKiirasa();
                    break;
                case 6:
                    exit=false;
                    break;
                default:
                    System.out.println("Hibás müvelet!");
                    break;

            }

        } // while vege

    }
}