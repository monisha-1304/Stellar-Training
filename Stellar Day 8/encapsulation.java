class human {
    private String name = "Monisha";
    private int Reg_no = 93;

    String get_name() {
        return name;
    }

    int get_regNo() {
        return Reg_no;
    }
}
public class encapsulation {
    public static void main(String args[])
    {
        human ob = new human();
        System.out.println(ob.get_name());
        System.out.println(ob.get_regNo());
    }
}