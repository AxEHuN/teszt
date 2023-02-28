import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Szemely szemely = new Szemely("Mona Lisa",20, false);
        System.out.println(szemely);

        System.out.println("Adjon meg 2 hallgatót és 2 oktatót: ");
        String [] adatok = new String[4];
        int db=0;
        Scanner sc = new Scanner(System.in);
        while (db< adatok.length){
            adatok[db++]=sc.nextLine();

        }

    }

static double method1(String[] tomb) {
    double ossz=0.0;
    int db=0;
    for (int i = 0; i < tomb.length; i++) {
        String[] tmp = tomb[i].split(" ");
        if (tmp.length == 3) {
         if (Integer.parseInt(tomb[i].split(" ")[3])>=4){
            ossz+=Integer.parseInt(tomb[i].split(" ")[3]);
            db++;
        }
        }
    }
    return ossz/db;
}
}//
