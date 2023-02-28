public class Oktato extends Ember {
    private int okt_azon;

    public Oktato(String nev, int okt_azon) {
        super(nev);
        this.okt_azon = okt_azon;
    }

    @Override
    public void koszon() {
        super.koszon();
        System.out.println("oktato id: " + okt_azon);
    }
}
