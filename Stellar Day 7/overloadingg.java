class calculator {
    void add(int a,int b) {
        System.out.println(a+b);
    }
    double add(double a ,double b){
        return a+b;
    }
    int add(int a,int b,int c) {
        return a+b+c;
    }
}
public class overloadingg {
    public static void main(String args[])
    {
        calculator c = new calculator();
        c.add(5,2);
        System.out.println(c.add(10.3,5.7));
        System.out.println(c.add(9,3,1));
    }
} 