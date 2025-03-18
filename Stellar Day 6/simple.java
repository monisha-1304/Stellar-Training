import java.util.*;
class A
{
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
}
class B extends A {
    void add() {
    int c=a+b;
    System.out.println(c);
    }
}
class C {
    public static void main(String args[])
    {
         B ob=new B();
         ob.add();

    }
}