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
class C extends A {
    void mul(){
        int d=a*b;
        System.out.println(d);
    }
}
class D {
    public static void main(String args[])
    {
         B ob=new B();
         ob.add();
         C ob1=new C();
         ob1.mul();

    }
}