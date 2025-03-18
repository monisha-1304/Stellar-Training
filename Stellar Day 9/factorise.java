import java.util.Scanner;
abstract class AbstractClass {
    abstract void get_value();
    abstract void divsum();
}
class Calculator extends AbstractClass {
    void get_value() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
    }
    void divsum() {
        int  n=5;
        int sum=0;
        for(int i=1;i<=n;i++) {
            int div = n%i; 
            if(div==0){
            sum = sum+i;
            }
        }
        System.out.println(sum);
    }
}
class factorise {
    public static void main (String args[]) {
        Calculator ob = new Calculator();
        ob.get_value();
        ob.divsum();

    }
}