import java.util.Scanner;
class reverseStr {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String r="";
        char c;
        for(int i=0;i<str.length();i++) {
            c=str.charAt(i);
            r=c+r;
        }
        System.out.println(r);
    }
}