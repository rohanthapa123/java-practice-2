class SavingsAccount{
    private static double rate ;
    private double savingsBalance;
    public SavingsAccount(double balance){
        savingsBalance = balance;
    }
    public void calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * rate)/12;
        savingsBalance+=monthlyInterest;
    }
    public static void modifyInterestRate(double r){
        rate = r;
    }
    public double getSavingsBalance(){
        return savingsBalance;
    }   
}

public class Bank {
    public static void main(String[]args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);        
        System.out.println("Initital Balance ");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nBalances after 1 month at 4% interest:");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nBalances after another 1 month at 5% interest:");
        System.out.println("Saver 1: $" + saver1.getSavingsBalance());
        System.out.println("Saver 2: $" + saver2.getSavingsBalance());
   
        
    }
}
