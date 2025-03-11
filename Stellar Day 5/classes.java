class classes {
    void display(int a)
    {
        System.out.println("this is my engine "+a);
    }
    void display1()
        {
            System.out.println("method2");
        }
    void display2()
    {
        System.out.println("method3");
    }
    }
    class b{

    
    public static void main(String args[])
    {
        classes audi=new classes();
        audi.display(100);
        classes ob=new classes();
        ob.display(5000);
        ob.display1();
        ob.display2();
    }
}
