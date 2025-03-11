class A {
    int i=5;
    A(int i)
    {
        this.i=i;
    }
    void show()
    {
        System.out.println(i);
    }

}
public class thiss {
    public static void main(String args[])
    {
        A ob = new A(100);
        ob.show();
    }
}