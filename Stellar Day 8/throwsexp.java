public class throwsexp {
    void div() throws ArithmeticException,ArrayIndexOutOfBoundsException 
    {
        int a=10;
        int b=0;
        int c=a/b;
        int arr[] ={1,2,3};
        System.out.println(arr[7]);
        System.out.println(c);
    }
    public static void main(String args[])
    {
         throwsexp tr = new throwsexp();
        try {
            tr.div();
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        }
    }
}