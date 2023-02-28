public class Main implements Foo,Foo2{
    public static void main(String[] args) {

    }

    @Override
    public double hello() {
        return 10.0;
    }

    @Override
    public void szia() {
        System.out.println("szia");

    }
}