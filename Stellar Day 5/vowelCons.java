import java.util.Scanner;
class vowelCons {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int vowel=0,cons=0,digit=0,space=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();++i)
        {
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                ++vowel;
            }
            else if (c>='a' && c<='z') {
                ++cons;
            }
            else if(c>='0' && c<='9') {
                ++digit;
            }
            else if(c==' '){
                ++space;
            }
        }
        System.out.println("vowels: "+vowel);
        System.out.println("consonant: "+cons);
        System.out.println("digit: "+digit);
        System.out.println("space: "+space);
    }
}