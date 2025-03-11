class A
{
    int a=10;
    int b=5;
}
class B extends A {
    int e=3;
    int f=2;
    void add() {
    int c=a+b;
    System.out.println(c);
    }
}
class C extends B {
    void mul(){
        int d=f*e;
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