package pack;

public class Test2 {
    public static void main(String[] args) {

        try {
            String[] st = new String[]{"aa","bb","cc"};
            for (int i=0;i<=3;i++){
                System.out.println(st[i]);
            }

        }catch (IndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Ez biztos lefut!");
        }
    }
}
