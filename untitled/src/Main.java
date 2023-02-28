public class Main {
    public static void main(String[] args) {
        System.out.println("Szökő évek száma: "+szoko_evek_Szama(1900,2022));
        System.out.println("LNKO "+ lnko(360,225));
        System.out.println(palindrome(505));
    }
    public static int szoko_evek_Szama(int ev1, int ev2) {
        int counter=0;
        for (int i=ev1;i<ev2;i++){
            if (i%4==0 && i%100!=0 || i%400==0){
                counter++;
            }

        }
        return counter;
    }
    public static int lnko(int a, int b){
        int maradek;
        do{
            maradek=a%b;
            a=b;
            b=maradek;
        }while (maradek!=0);
            return a;
    }

    public static boolean palindrome (int szam){
        int masolat = szam;
        int forditott=0;

        while (szam!=0){
            int szj=szam%10;
            szam=szam/10;
            forditott=forditott*10+szj;

        }
        return masolat==forditott;
    }




}