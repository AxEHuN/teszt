package legikozlekedes;

import repules.flotta;
import repules.repulogep;
import repules.utasszallito;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class legitarsasag implements flotta.Flotta {

    public String name;
    public List<repulogep> repulogepList;

    public legitarsasag(String name, List<repulogep> repulogepList) {
        this.name = name;
        this.repulogepList = repulogepList;
    }

    @Override
    public void felvesz(repulogep repulo) {
        this.repulogepList.add(repulo);
    }

    @Override
    public List<utasszallito> megfeleloGepek(int utasszam) {
        List<utasszallito> utasszallitoList = new ArrayList<>();

        for (int i=0;i<repulogepList.size();i++){
            if (repulogepList.get(i).getClass()==utasszallito.class){
                utasszallito Utassz = (utasszallito) repulogepList.get(i);
                if (utasszallito.getFerohely() >= utasszam ){
                    utasszallitoList.add(Utassz);
                }
            }
        }
        Collections.sort(utasszallitoList);
        return utasszallitoList;
    }

    @Override
    public void kiir(String fajlnev) {
        try{
        FileWriter fileWriter = new FileWriter(fajlnev);
        fileWriter.write(name);
        for(var repulo : repulogepList){
            fileWriter.write(repulo.toString()+"  \n");

        }
        fileWriter.close();
        }
        catch(IOException e) {
            System.out.println("Rossz file");
        }

    }
}
