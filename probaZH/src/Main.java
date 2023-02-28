import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       while (true) {
           System.out.println("Müvelet: ");
           System.out.println("1.: parcella felvétele");
           System.out.println("2.: parcellához termési adat felvétele, a parcellát helyrajzi szám alapján választjuk ki");
           System.out.println("4.: termés adat módosítása helyrajzi szám és évszám alapján, csak az össz etrmés módosítható, az átlagot újra számolja");
           Scanner scanner = new Scanner(System.in);
           int muvelet = scanner.nextInt();
           szolobirtok birtok = new szolobirtok();

           List<parcella> adat = new ArrayList<>();
           parcella newparcella = new parcella();

           switch (muvelet){
               case 1 :
                   birtok.hozzaad(adat);
                   break;
               case 2:
                    birtok.SetTermesiAdat(1,newparcella);
                    break;
           }
       }
    }
}