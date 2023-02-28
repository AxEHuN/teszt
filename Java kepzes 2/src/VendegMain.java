public class VendegMain {

    public static kocsma [] adott_ital_kinalat(String ital, VendéglátóIE[] v){
        int count = 0;
        int index=0;

        for (int i=0;i<v.length;i++){
            if (v[i] instanceof kocsma){
                kocsma k = (kocsma)v[i];
                for (int j=0;j<k.getSorlap().length;j++){
                    if (k.getSorlap()[j].equals(ital)){
                        count++;
                    }
                }
            }
        }
        kocsma [] tomb_vissza = new kocsma[count];//1
        for (int i=0;i<v.length;i++){
            if (v[i] instanceof kocsma){
                kocsma k = (kocsma)v[i];
                for (int j=0;j<k.getSorlap().length;j++){
                    if (k.getSorlap()[j].equals(ital)){
                        tomb_vissza[index++]=k;
                    }
                }
            }
        }


        return tomb_vissza;
    }

    public static void main(String[] args) {
        VendéglátóIE [] vend = new VendéglátóIE[7];

        vend[0]=new kocsma("Ibolya", 100,true, new String[]{"Borsodi","Heineken","Soproni"});
        vend[1]=new kocsma("Gabibar", 90,true, new String[]{"Kobanyai","Heineken","Soproni"});
        vend[1]=new kocsma("Barva", 90,true, new String[]{"Kobanyai","Heineken","strongbow"});
        vend[2]=new Etterem("McDonalds", 50,false,new String[]{"Rizibizi","toltottkaposzta"});

        kocsma[] kocs = adott_ital_kinalat("Kobanyai",vend);
        System.out.println(kocs[0]);
        System.out.println(kocs[1]);
       /* for (int i=0;i<=kocs.length;i++){
            System.out.println("kocs i: " + i);
            System.out.println(kocs[i]);
        }*/




    }
}
