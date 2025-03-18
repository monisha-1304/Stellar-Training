class task {
    public static void main(String args[]){
    String[]Tasks = {"task1","task2","task3"};
    try {
        System.out.println(Tasks[5]);
    }
    catch(Exception e) {
        System.out.println(e);
        System.out.println("Invalid index . Please try again ");
    }
}
}