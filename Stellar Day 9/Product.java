import java.util.Scanner;
interface Product {
   abstract void ProductDetails();
   abstract void show_Bill();
}
class Things implements Product{
    public void ProductDetails() {
        Scanner sc = new Scanner(System.in);
        int no_items = sc.nextInt();
        String name = sc.nextLine();
        int bill=0;
        for(int i=0;i<no_items;i++) {
        int cost_product[] = sc.nextInt();
        }
        for (int i=0;i<cost_product.length;i++)
        {
         bill = bill+cost_product[i];
        }
        int tot_bill;
        if(tot_bill<=10000) {
            tot_bill=bill;
        }
        else if(bill>10000 && bill<=30000) {
            tot_bill = bill+(bill/100)*5;


        }
        else if(bill>30000 && bill<=50000) {
            tot_bill = bill+(bill/100)*7;
    

        }
        else if(bill>50000) {
            tot_bill = bill+(bill/100)*9;

        }
        show_Bill(tot_bill);
    }
    public void show_Bill() {
        System.out.println("total bill is :"+tot_bill);
    }
}
class display{
    public static void main(String args[])
    {
        Things ob = new Things();
        ob.ProductDetails();
        ob.show_Bill();
    }
}
