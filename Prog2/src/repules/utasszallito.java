package repules;

public class utasszallito extends repulogep {
    protected int ferohely;

    public utasszallito(String gyarto, String tipus, double hosz, boolean sugarhajtasu, int ferohely) {
        super(gyarto, tipus, hosz, sugarhajtasu);
        this.ferohely = ferohely;
    }

    public static int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    @Override
    public String toString() {
        return super.toString() + ", "+ ferohely + "ferohelyes";
    }
}
