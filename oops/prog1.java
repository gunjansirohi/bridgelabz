package oops;



public class prog1 {
    static class BankAccount{
    static String bankname = "SBI";
    String Accountholder;
    double accountNumber;
    static int totalaccounts;
    BankAccount(String Accountholder,double accountNumber){
        this.Accountholder=Accountholder; 
        this.accountNumber=accountNumber; 
        totalaccounts++; 
    }
    public void gettotalaccounts(){
        System.out.println(totalaccounts + "and bank name is "+BankAccount.bankname);
    }


    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("hemant",12345);
        BankAccount b2 = new BankAccount("gagan", 234678);
        b1.gettotalaccounts();
        System.out.println(b1 instanceof BankAccount);
        System.out.println(b2 instanceof BankAccount);

    }

    
}