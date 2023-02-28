import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class Szolobirtok {
   private List<Parcella> szolobirtokok;

   public Szolobirtok(List<Parcella> szolobirtokok) {
      this.szolobirtokok = szolobirtokok;
   }

   public List<Parcella> getSzolobirtokok() {
      return szolobirtokok;
   }

   public void setSzolobirtokok(List<Parcella> szolobirtokok) {
      this.szolobirtokok = szolobirtokok;
   }

   @Override
   public String toString() {
      return "szolobirtokok=" + szolobirtokok;
   }
   public void addParcella(Parcella p){ // Parcella felvétele
      szolobirtokok.add(p);
   }
   public void termesiAdatFelvetel1(int helyrajz) { //parcellához termési adat felvétele, a parcellát helyrajzi szám alapján választjuk ki
      vanAdat:
      for (int i = 0; i < szolobirtokok.size(); i++) {
         if (szolobirtokok.get(i).getHelyrajziszam() == helyrajz) {
            if (szolobirtokok.get(i).getTermes().getEv() == 0) {
               Scanner ch = new Scanner(System.in);
               System.out.println("Éves termés! " + '\n' + "Add meg az évet(Int): ");
               int ev = ch.nextInt();
               szolobirtokok.get(i).termes.setEv(ev);
               System.out.println("Add meg az össztermést(double)");
               double osszterm = ch.nextDouble();
               double calcOsszterm = osszterm;
               szolobirtokok.get(i).termes.setOssztermes(osszterm);
               szolobirtokok.get(i).termes.setAvgtermes(szolobirtokok.get(i).getTokeszam() / calcOsszterm);
               System.out.println("Minden adat beállítva!");
               }else{
               System.out.println("Termési adat létezik!");
               break vanAdat;
            }
            }//if (szolobirtok)
         }//for2
         for (int i = 0; i < szolobirtokok.size(); i++) {
            System.out.println(szolobirtokok.get(i).toString() + '\n');
         }
   }// method
   public void termesiAdatFelvetel2(int helyrajz) { //parcella adatainak módosítása helyrajzi szám alapján, a helyrajzi szám nem módposítható, minden más igen
         for (int i = 0; i < szolobirtokok.size(); i++) {
            if (szolobirtokok.get(i).getHelyrajziszam() == helyrajz) {
               Szolofajta sz1 = Szolofajta.Furmint;
               Szolofajta sz2 = Szolofajta.Kékfrankos;
               Szolofajta sz3 = Szolofajta.Leányka;
               System.out.println("1." + sz1 + '\n');
               System.out.println("2." + sz2 + '\n');
               System.out.println("3." + sz3 + '\n');
               System.out.println("Válassz szőlőfajtát: " + '\n');
               Scanner ch = new Scanner(System.in);
               int choice = ch.nextInt();

               switch (choice) {
                  case 1:
                     szolobirtokok.get(i).setSzolo(sz1);
                     break;
                  case 2:
                     szolobirtokok.get(i).setSzolo(sz2);
                     break;
                  case 3:
                     szolobirtokok.get(i).setSzolo(sz3);
                     break;
                  default:
                     System.out.println("Nem létezik ilyen szőlő ezért a" + sz1 + " tipust állitom be!");
                     szolobirtokok.get(i).setSzolo(sz1);
                     break;

               } // switch (choice)
               System.out.println("Add meg a tőkeszámot(Int): ");
               int toke = ch.nextInt();
               int calcToke = toke;
               szolobirtokok.get(i).setTokeszam(toke);
               System.out.println("Éves termés! " + '\n' + "Add meg az évet(Int): ");
               int ev = ch.nextInt();
               szolobirtokok.get(i).termes.setEv(ev);
               System.out.println("Add meg az össztermést(double)");
               double osszterm = ch.nextDouble();
               double calcOsszterm = osszterm;
               szolobirtokok.get(i).termes.setOssztermes(osszterm);
               szolobirtokok.get(i).termes.setAvgtermes(calcToke / calcOsszterm);
               System.out.println("Minden adat beállítva!");

            }//if (szolobirtok)
         }//for
         for (int i = 0; i < szolobirtokok.size(); i++) {
            System.out.println(szolobirtokok.get(i).toString() + '\n');
         }
   }// method

   public void adatokBekerese(){
      Scanner ch=new Scanner(System.in);
      System.out.println("Add meg a helyrajzi számot: \n"); //helyrajzi
      int helyrajzi = ch.nextInt();
      int helyrajzivegleges = 0;
      boolean van = false;

      vanHelyrajzi:
      for (int i=0;i<szolobirtokok.size();i++){

         if (szolobirtokok.get(i).getHelyrajziszam()!=helyrajzi){
            van = false;
         }
         else {
            System.out.println("Ilyen helyrajzi szám már létezik!");
            helyrajzivegleges = szolobirtokok.get((szolobirtokok.size()-1)).getHelyrajziszam()+2;
            System.out.println("Beállitott alapértelmezett érték: " + helyrajzivegleges);
            break vanHelyrajzi;

         }
      }
      if (van==false){helyrajzivegleges=helyrajzi;}

      Szolofajta sz1=Szolofajta.Furmint;
      Szolofajta sz2=Szolofajta.Kékfrankos;
      Szolofajta sz3=Szolofajta.Leányka;
      System.out.println("1."+sz1+'\n');
      System.out.println("2."+sz2+'\n');
      System.out.println("3."+sz3+'\n');
      System.out.println("Válassz szőlőfajtát: " + '\n');

      int choice = ch.nextInt();
      Szolofajta szolo;

      switch (choice){ // szolofajta
         case 1:
            szolo = sz1;
            break;
         case 2:
            szolo = sz2;
            break;
         case 3:
            szolo = sz3;
            break;
         default:
            System.out.println("Nem létezik ilyen szőlő ezért a" +sz1 + " tipust állitom be!");
            szolo = sz1;
            break;

      } // switch (choice)
      System.out.println("Add meg a tőkeszámot(Int): ");
      int toke = ch.nextInt();
      int calcToke = toke; //tőkeszam
      System.out.println("Éves termés! " + '\n' + "Add meg az évet(Int): " );
      int ev = ch.nextInt();
      System.out.println("Add meg az össztermést(double)");
      double osszterm = ch.nextDouble();
      double calcOsszterm = osszterm; //össztermés
      Evestermes termes = new Evestermes(ev, osszterm);

      Parcella obj = new Parcella(helyrajzivegleges,szolo,calcToke,termes);
      addParcella(obj);
   }
   public void termesModosit(int hely,int evszam){
   for (int i = 0; i < szolobirtokok.size(); i++) {
      if (szolobirtokok.get(i).getHelyrajziszam() == hely && szolobirtokok.get(i).termes.getEv()==evszam){
         System.out.println("Add meg az össztermést: ");
         Scanner ch = new Scanner(System.in);
         double newTermes = ch.nextDouble();
         szolobirtokok.get(i).getTermes().setOssztermes(newTermes);
         szolobirtokok.get(i).getTermes().setAvgtermes(szolobirtokok.get(i).getTokeszam()/newTermes);
      }//if vege
   }//for vege
   }// method vege
   public void adatokKiirasa(){
      for (int i = 0; i< szolobirtokok.size(); i++){
         System.out.println(szolobirtokok.get(i).toString() + '\n');
      }
   }
}
