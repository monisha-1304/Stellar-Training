import java.util.*;
abstract class marks {
    abstract void getPercentage();

}
class A extends marks {
    float m1,m2,m3;
    A(float m1,float m2,float m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    
    void getPercentage() {
        
        System.out.printf ("%.2f\n",((m1+m2+m3)/3));
    }

}
class B extends marks {
    float m1,m2,m3,m4;
    B(float m1,float m2,float m3,float m4){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
    }
    
   void getPercentage() {
         System.out.printf("%.2f\n",((m1+m2+m3+m4)/4));
    
    }
}
class result {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       float m1=sc.nextFloat();
       float m2=sc.nextFloat();
        float m3=sc.nextFloat();
        float m4=sc.nextFloat();
        float m5=sc.nextFloat();
        float m6=sc.nextFloat();
       float m7=sc.nextFloat();
       
         A ob1 = new A(m1,m2,m3);
        ob1.getPercentage();
         B ob2 = new B(m4,m5,m6,m7);
         ob2.getPercentage(); 
    }
} 