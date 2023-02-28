public class Hallgato extends Szemely{
    private double avg;

    public Hallgato(String nev, int eletkor, boolean ferfi, double avg) {
        super(nev, eletkor, ferfi);
        this.avg = avg;
    }

    @Override
    public String toString() {
        return
                "avg=" + avg + "\n" +
                ", nev='" + nev + '\n' +
                ", eletkor=" + eletkor;
    }
    public static boolean isGood(double avg){
        return avg >= 4;
    }
}
