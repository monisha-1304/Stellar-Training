interface mul {
    int i=100;
    void show();
}
class add implements mul{
    add(int z){
        System.out.println(z);
    }
    public void show(){
        System.out.println(i);
    }
}
public class interfacee {
    public static void main(String args[])
    {
        add ob=new add(200);
        ob.show();
    }
}