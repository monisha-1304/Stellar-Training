interface A 
{
    int i=100;
    void show();
}
interface B
{
    int j=200;
    void display();
}
interface C 
{
    int k=300;
    void printt();
}
class D 
{
    void demo()
    {
        System.out.println("this is demo class");
    }
}
class E extends D implements A,B,C {
    public void show()
    {
        System.out.println(i);
    }
    public void display()
    {
        System.out.println(j);
    }
    public void printt()
    {
        System.out.println(k);
    }
}
public class mutiple {
    public static void main(String args[])
    {
        E ob=new E();
        ob.show();
        ob.display();
        ob.printt();
        ob.demo();
    }
}