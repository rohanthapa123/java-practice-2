class BankAccount{
    private final String name,accountType,accountNumber;
    private double balance;
    public BankAccount( String name,String accN, String accType,double bal){
        this.name = name;
        accountNumber = accN;
        accountType = accType;
        balance = bal;
    }
    public void deposit(double bal){
        if(bal > 0){
            balance += bal;
            System.out.println("Deposit of $"+bal+" Successful. New Balance is $"+balance);
        }else{
            System.out.println("Invalid Deposit Amount");
        }
            
    }
    public void withdraw(double bal){
        if(balance >= bal){
            balance-=bal;
            System.out.println("Withdraw success!! Your new balance is " + this.balance);
            
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    public void GetDetail(){
        System.out.println("Detail:\nAccount Holder :"+name);
        System.out.println("Balance :"+balance);
    }
    
}
public class MyBank {
    public static void main(String[]args){        
        BankAccount acc1 = new BankAccount("Rohan Thapa","03810017511026","Saving",2500000.00);
        
        acc1.GetDetail();
        acc1.deposit(5000);
        acc1.GetDetail();
        acc1.withdraw(35000);
        acc1.GetDetail();
    }
}
