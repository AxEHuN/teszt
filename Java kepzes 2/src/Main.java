import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QuadraticEquation e1 = new QuadraticEquation(-10,30,-1);
        System.out.println("x1="+e1.getRoot1());
        System.out.println("x2="+e1.getRoot2());


        Account.setAnnualIr(1.5);
        System.out.println(Account.getAnnualIr());

        Account sz1 = new Account(1,100);
        Account sz2 = new Account(2,200);
        System.out.println(sz1);
        System.out.println(sz2);
        sz1.deposit(30);
        System.out.println(sz1);

        Scanner sc = new Scanner(System.in);//beolvasás kepernyorol
        //sc.next()
        double [] tomb = new double[30];
        int index=0; double c;
        while ((c=sc.nextDouble())!=0){
            tomb[index]=c;
            index++;
        }
        for (int i=0;i<index;i++){
            System.out.println(tomb[i]);
        }


    }
}