import java.util.Scanner;
class palindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder s1=new StringBuilder(s);
        s1.reverse();
        if(s.equals(s1.toString())) {
            System.out.println("palindrome");
        }
        else
        System.out.println("not a palindrome");
    }
}