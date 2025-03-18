class marks {
    public static void main(String args[])
    {
        int marks[]= {85,90,78,88,76};
        try {
            System.out.println(marks[7]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("Index out of bounds. Valid range from 0 to 4");
        }
    }
}