abstract class car {
    abstract void accelerator();
    abstract void brake();
    abstract void clutch();
}
class imp extends car {
    public void accelerator()
    {
        System.out.println("Go");
    }
    public void brake()
    {
        System.out.println("Stop");
    }
    public void clutch()
    {
        System.out.println("Speed");
    }
}
public class abstractionn {
    public static void main(String args[]) {
        imp bmw = new imp();
        bmw.accelerator();
        bmw.brake();
        bmw.clutch();
    }
}