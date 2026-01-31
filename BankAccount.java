public class BankAccount {

    String ownername;
    double balance;

    BankAccount(String ownername, double balance){
        this.ownername = ownername;
        this.balance = balance;
    }
    
    public void withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
            System.out.println("Success! New Balance: " + balance);

        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
