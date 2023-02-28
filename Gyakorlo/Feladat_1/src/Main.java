import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;

import java.util.Arrays;
import java.util.Collections;


public class Main {
    private static int db;

    public static void main(String[] args) {
       Auto auto = new Auto(args[0],100,true);
       Auto auto2 = new Auto("AAA222",150,true);
       Auto auto3 = new Auto("AAA333",200,false);
       Auto auto4 = new Auto("AAA444",250,true);
       Teherauto teherauto = new Teherauto("AAA444",250,true, 1000);

        System.out.println(auto);

        Scanner sc = new Scanner(System.in);
        int count = 0;
        String line = null;
        String [] autok = new String[4];
        while(!(line = sc.nextLine()).isEmpty()) {
           autok[db] = line;
            db++;
        }
        sc.close();
        String [] sorted = method1(autok,db);
        for(int i = 0; i < sorted.length; i++){
           if (sorted[i]!=null) System.out.println(sorted[i]);
        }

        System.out.println("Az " + auto.getClass().getName() + " |" + auto.getCount() + "| " + "példánnyal rendelkezik!");


        String [] maxok = method2(autok,db);
        for (var a : maxok) {
            System.out.println(a);
        }

    }

    public static String[] method1(String [] tomb, int db){
      String [] tmp2 = new String[db];
        int count = 0;
        for (int i = 0; i < db; i++){
            if (Character.isDigit(tomb[i].charAt(tomb[i].length() - 1))){
                String [] tmp = tomb[i].split(" ");
                int teher=Integer.parseInt(tmp[tmp.length - 1]);
                if (teher>20){
                   tmp2[count] = tomb[i];
                    count++;
                }
            }
        }
        return tmp2;
    }

    public static String[] method2(String [] tomb, int db) {
        if (db < 3)
        {
            String[] ret = new String[db];
            for (int i = 0; i < db; i++) {
                ret[i]=tomb[i];
            }
            return ret;
        }
        else {
            Integer[] sort = new Integer[db];
            for (int i = 0; i < db; i++) {
                sort[i] = Integer.parseInt(tomb[i].split(" ")[1]);
            }

            Arrays.sort(sort, Collections.reverseOrder());
            int index = 0;
            String max[] = new String[3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < db; j++) {
                    if (sort[i] == Integer.parseInt(tomb[j].split(" ")[1])) {
                        if (index == 3) break;
                        else {
                            max[index] = tomb[j];
                            index++;
                        }
                    }
                }
            }
            return max;
        }
    }
}