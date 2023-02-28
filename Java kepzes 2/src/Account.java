import java.util.*;

public class Account {
    private int id;
    private double balance;
    private static double annualIr=0;
    private Date dateCreated;


    public Account() {
        this.balance=0;
        this.id=0;
        this.dateCreated=new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualIr() {
        return annualIr;
    }

    public static void setAnnualIr(double annualIr) {
        Account.annualIr = annualIr;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public void withdraw(double money){
        this.balance-=money;
    }
    public void deposit(double money){
        this.balance+=money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
