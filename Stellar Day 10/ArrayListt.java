import java.util.*;
public class ArrayListt {
    public static void main(String args[])
    {
    List<String> list =new ArrayList<>();
    list.add("Apple");
    list.add("Orange");
    list.add("Apple");
    list.add("Banana");
    System.out.println("List : " + list);
    list.remove("Apple");
    System.out.println("Remove List : " + list);
}
}