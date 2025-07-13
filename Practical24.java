class InsufficientBalance extends Exception {
    public InsufficientBalance(String message) {
        super(message);
    }
}
class BankingSystem{
public int balance;
public void deposit(int bal){
    balance =balance+ bal;
    System.out.println(" Rs"+balance+" is deposited in account");
}
public void withdraw(int withdrawamount){
    try{
        if(balance<withdrawamount)
        throw new InsufficientBalance("Not enough fund");
        this.balance = this.balance- withdrawamount;
        System.out.println("Amount debited "+withdrawamount+" Fund left "+this.balance+"\n");
        
    }
    catch(InsufficientBalance m1){
        System.out.println(m1.getMessage());
    }
    
}

}

public class Practical24 {
    public static void main(String[] args) {
        BankingSystem obj = new BankingSystem();
        obj.deposit(25000);
        obj.withdraw(20000);
        obj.withdraw(4000);
        obj.withdraw(2000);
    }
}
