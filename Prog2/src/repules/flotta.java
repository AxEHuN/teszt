package repules;

public interface flotta {
    public interface Flotta
    {
        // új repülőgépet vesz fel a flottába
        public void felvesz(repulogep repulo);
        // visszaadja azoknak az utasszállítóknak a rendezett listáját (a természetes
        // rendezettség sorrendjében), amelyek legalább a paraméterben megkapott számú
        // férőhellyel rendelkeznek
        public java.util.List<utasszallito> megfeleloGepek(int utasszam);
        // kiírja a megadott állományba a repülőgépek listáját (mindegyiket külön sorba)
        public void kiir(String fajlnev);
    }

}
