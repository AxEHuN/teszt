import java.util.ArrayList;
import java.util.List;

public class Main {

    private String vezeteknev;

    private String keresztnev;


    List<Main> list = new ArrayList<>();

    Main object = (Main) list.stream().filter(e -> e.getKeresztnev().equals("Sándor"));

    public Main(String vezeteknev, String keresztnev) {

        this.vezeteknev = vezeteknev;

        this.keresztnev = keresztnev;

    }



    public String getKeresztnev() {

        return keresztnev;

    }



    public String getVezeteknev() {

        return vezeteknev;

    }

}