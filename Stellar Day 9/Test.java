import java.util.Scanner;
class Bicycle {
    Scanner sc = new Scanner(System.in);
    int gears = sc.nextInt();
    int speed = sc.nextInt();
}
class MountainBike extends Bicycle {
    int seat_height = sc.nextInt();
    void display() {
        System.out.println("No of gears are " + gears);
        System.out.println("Speed of bicycle is  " + speed);
        System.out.println("Seat of height is : "+ seat_height);
    } 
}
class Test {
    public static void main(String args[]) {
        MountainBike ob = new MountainBike();
        ob.display(); 

}