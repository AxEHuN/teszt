import java.text.NumberFormat;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        double rangeMin=1;
        double rangeMax=100;
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        System.out.println(randomValue);
        NumberFormat nf= NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(randomValue));
    }
}