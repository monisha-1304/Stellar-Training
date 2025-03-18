class average {
    public static void main(String args[]) {
        int arr[] = {};
        int a = arr.length;
        int sum=0;
        for(int i=0;i<a;i++) {
            sum=sum+arr[i];
        }
        try { 
        int average = sum/a;
        System.out.println(average);
    }
    catch(ArithmeticException e) {
        System.out.println(e);
    }
}
}