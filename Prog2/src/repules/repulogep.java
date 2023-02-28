package repules;

import java.util.Comparator;
import java.util.Objects;

public class repulogep implements Comparable<repulogep> {
    protected String gyarto;
    protected String tipus;
    protected double hosz;
    protected boolean sugarhajtasu;

    public repulogep(String gyarto, String tipus, double hosz, boolean sugarhajtasu) {
      if (hossz<0){
          throw IllegalArgumentException();
      }else {
          this.gyarto = gyarto;
          this.tipus = tipus;
          this.hosz = hosz;
          this.sugarhajtasu = sugarhajtasu;
      }
    }

    public String getGyarto() {
        return gyarto;
    }

    public boolean isSugarhajtasu() {
        return sugarhajtasu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        repulogep repulogep = (repulogep) o;
        return gyarto.equalsIgnoreCase((repulogep) o).gyarto)&& tipus.equalsIgnoreCase((repulogep) o).tipus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gyarto, tipus);
    }

    @Override
    public String toString() {
       if (sugarhajtasu){
           return gyarto + " " + tipus + " sugarhajtasu repulogep, hossza " + hosz;
    }else
        return gyarto + " " + tipus + ", hossza " + hosz;
}
    @Override
    public int compareTo(repulogep o){
        if (gyarto.equalsIgnoreCase(o.gyarto) !=0){
           return gyarto.compareTo(o.gyarto);
        }else {
           return tipus.compareToIgnoreCase(o.tipus);
        }

    }
}
