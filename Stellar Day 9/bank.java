import java.util.Scanner;
class Account{
    int AccoundId;
    String HolderName;
    int Balance;
    Account(int AccoundId,String HolderName,int Balance) {
        this.AccoundId = AccoundId;
        this.HolderName = HolderName;
        this.Balance = Balance;
    }
    void setAccountBalance() {
        if(Balance>=0)
        {
            System.out.println("balance is " + Balance);
        }
        else {
            Balance=0;
            System.out.println("balance is "+ Balance);
        }

    }
    void Credit(){
        Scanner sc = new Scanner(System.in);
        int deposit = sc.nextInt();
        int new_balance = Balance+deposit;
        System.out.println("new balance :" +new_balance);
    }
}
class VIPAccount extends Account {
    void AccountBalance(){
        System.out.println("negative balance");
    }
    VIPAccount(int AccoundId,String HolderName,int Balance) {
        System.out.println("AccountId :"+AccoundId);
        System.out.println("HolderName :"+ HolderName);
        System.out.println("Balance :"+Balance);
    }
}
class bank {
    public static void main(String args[]){
        VIPAccount ob = new VIPAccount(7,Moni,5000);
        ob.setAccountBalance();
        ob.Credit();
    }
}