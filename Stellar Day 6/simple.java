class A
{
    int a=10;
    int b=5;
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