public class exceptionn {
    public static void main(String args[]) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println("Operation pending...");
        }
       finally {
        System.out.println("Success");
       }
    }
}