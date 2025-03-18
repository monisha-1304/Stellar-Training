public class throwexp {
    public static void main(String args[]) {
        int age =16;
        try {
        if(age<18) {
            throw new ArithmeticException("age must be greater - not eligible");
        }
        else {
            System.out.println("eligible");
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
}