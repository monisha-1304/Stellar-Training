public class ownexp {
    void check_age(int age) throws CustomeException{
        if(age<18) {
            throw new CustomeException("age must be greater - not eligible");
        }
        else {
            System.out.println("accpeted - eligible");
        }
    }
    public static void main(String args[])
    {
        try {
        ownexp ob = new ownexp();
        ob.check_age(7);
    }
    catch (Exception e)
    {
        System.out.println(e);
        System.out.println("declined");
    }
    }
}