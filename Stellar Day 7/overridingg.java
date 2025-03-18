class animal {
    void sound() {
        System.out.println("nothing");
    }
}
class dog extends animal {
    void sound() {
        System.out.println("bark");
    }
}
class cat extends animal{
    void sound() {
        System.out.println("meow");
    }
}
public class overridingg 
{
    public static void main(String args[])
    {
        cat tom = new cat();
        tom.sound();
        dog shiro = new dog();
        shiro.sound();
        animal cow = new animal();
        cow.sound();
    }
}