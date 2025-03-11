import java.util.Scanner;
class employ {
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int id=sc.nextInt();
int salary=sc.nextInt();

void get()
{
    System.out.println("name: " + name);
    System.out.println("id: "+ id);
    System.out.println("salary: "+salary);

}
}
class print{
    public static void main(String args[])
    {
        employ moni = new employ();
        employ karo = new employ();
        moni.get();
        karo.get();

    }
}