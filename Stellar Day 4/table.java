import java.util.Scanner;
class table{
    void mul()
    {
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(i + " x " + a + " = " + a*i);
        }
    }
    public static void main (String args[])
    {
        table ob = new table();
        ob.mul();
        ob.mul();
    }
}