package pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static List<lakohaz> tagasLakohaz(List<lakohaz> li, double terfogat){
        List<lakohaz> sorted = new ArrayList<>();
        for (lakohaz i : li){
            if (i.legkobmeter()>terfogat){
                sorted.add(i);
            }
        }
        return sorted;


    }

    public static void main(String[] args) {

        List<lakohaz> li = new ArrayList<>();
        List<Double> li2 = new LinkedList<>();

        li.add(new lakohaz("A01",10,30));
        li.add(new lakohaz("A02",12,50));
        li.add(new lakohaz("A03",14,60));
        li.add(new lakohaz("A04",10,30));
        li.add(new lakohaz("A05",10,30));
        li.add(new lakohaz("A06",8,20));

        List<lakohaz> tmp = tagasLakohaz(li, 1000);

        Collections.sort(tmp);

        for (lakohaz j : tmp)
            System.out.println(j);
    }
}
