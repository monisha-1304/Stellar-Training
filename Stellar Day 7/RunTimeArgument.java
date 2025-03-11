public class RunTimeArgument {
    public static void main(String [] args) {
        System.out.println("Number of arguments: "+ args.length);
        for(int i=0;i<args.length;i++)
        {
            System.out.println("argument " + (i+1) + " : " +args[i]);
        }
    }
}