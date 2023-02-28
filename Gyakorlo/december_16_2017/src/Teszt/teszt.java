package Teszt;
import ital.Ital;
import ital.SzeszesItal;
import vendeglatas.Kocsma;
import vendeglatas.NincsElégPiaException;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;

public class teszt {
    public static void main(String[] args) {
    try {
        System.out.println("Adja meg a file nevét: ");
        Scanner scanner = new Scanner(System.in);
        String filenev = scanner.next();
        filenev=filenev+".txt";
        System.out.println("File neve: " + filenev);
        File file = new File(filenev);
        List<Ital> italok = new ArrayList<Ital>();
        Scanner ital = new Scanner(file);
        while (ital.hasNext()) {
            String it = ital.nextLine();
            String [] tmp = it.split(";");
            if (tmp.length==3){
                italok.add(new Ital(tmp[0],tmp[1],Integer.parseInt(tmp[2])));
            }else if(tmp.length==4) {
                italok.add(new SzeszesItal(tmp[0],tmp[1],Integer.parseInt(tmp[2]),Double.parseDouble(tmp[3])));
            }
            }//while vege
        ital.close();
            for (Ital i : italok){
                System.out.println(i.toString());
            }
        Kocsma kocsma = new Kocsma(args.length<=1 ? "Egyetemi büfike" : args[1],italok);
            System.out.println("Alkohol limit: ");
            Scanner limits = new Scanner(System.in);
            double limit = limits.nextDouble();
            List<SzeszesItal> erosPiak = kocsma.erősPiák(limit);
            System.out.println(erosPiak.toString());

        System.out.println("Több mint 10 karakterü italok!" +  '\n');
        Set<Ital> set = moreThan10Ch(italok);
        System.out.println(set.toString());
        double resultTrue = kocsma.atlagAr(true);
        System.out.println("Atlag ar(true)" + resultTrue);
        double resultFalse = kocsma.atlagAr(false);
        System.out.println("Atlag ar(false)" + resultFalse);
        List<Ital> ureslist = new ArrayList<Ital>();
        Kocsma kocsma2 = new Kocsma("Ures kocsma",ureslist); //exceptiontest
        System.out.println("Ures kocsma" + kocsma2.atlagAr(true));




            }//try vege
    catch (FileNotFoundException e){
        System.out.println("File nem található.");
       // e.printStackTrace();
    } catch (NincsElégPiaException e) {
        e.getMessage();
    }
        ;

    }//main

   /*public boolean italCheck(List<Ital> i, String italnev,String allomany){ // ertelmezhetetlen feladat

        }
    }*/
    //8
    public static Set<Ital> moreThan10Ch(List<Ital> i){
        Set<Ital> set = new HashSet<Ital>();
        for (Ital ital : i) {
            if (ital.getMegnevezes().length()>10 && ital instanceof SzeszesItal){
                set.add(ital);
            }
        }
    return set;
    }

}//teszt
