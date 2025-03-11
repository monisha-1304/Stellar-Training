class car {
    int SpeedLimit = 120;
}
class audi extends car{
    int SpeedLimit=180;
    void show()
    {
        System.out.println("speedlimit is "+super.SpeedLimit);
        System.out.println("local speedlimit is "+SpeedLimit);
    }
}
public class Superr {
    public static void main(String args[])
    {
        audi ob = new audi();
        ob.show();
    }
}