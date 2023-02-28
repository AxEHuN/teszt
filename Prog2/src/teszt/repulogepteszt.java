package teszt;

import repules.repulogep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repulogepteszt {
    public static void main(String[] args) {
        List<repulogep> repulogepList = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(args[0]));
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] adatok = data.split(";");
                if (adatok[0].equals("R")){
                    repulogepList.add(new repulogep(adatok[1], adatok[2], adatok[3],adatok[4]));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File nem talalhato");
            throw new RuntimeException(e);
        }catch (ArrayIndexOutOfBoundsException e){

        }

    }
}
