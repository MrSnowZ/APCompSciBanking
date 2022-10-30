
//public static double bankBalance = 1000;
public class bank {


    public static double bankBalance = 20000;
    public double balance;
    public String accountType;
    public String username;
    public int accountNumber;
    public double initialAmount;
    

    public bank(double balance, String accountType, String username, int accountNumber, double initialAmount) {
        this.balance = balance;
        this.accountType = accountType;
        this.username = username;
        this.accountNumber = accountNumber;
        this.initialAmount = initialAmount;
    }

    public void deposit(double amount) {
        if (accountType.equals("savings") || accountType.equals("checking")) {
            balance += amount;
        } else if (accountType.equals("loan")) {
            balance -= amount;
        }
        double newBankBalance0 = balance + bankBalance;
        System.out.println("Bank's Balance after the desposit scenario is: " + newBankBalance0);
    }

    public void withdraw(double amount) {
        if (accountType.equals("savings") || accountType.equals("checking")) {
            balance -= amount;
        } else if (accountType.equals("loan")) {
            System.out.println("You cannot withdraw from a loan account.");
        }
        double newBankBalance1 = balance + bankBalance;
        System.out.println(newBankBalance1);
        System.out.println("Bank's Balance after the withdraw scenario is: " + newBankBalance1);
    }

    public static void main(String[] args) {
        bank account1 = new bank(1000, "savings", "John", 123456, 1000);
        bank account2 = new bank(1000, "checking", "Nick", 123456, 1000);
        bank account3 = new bank(1000, "loan", "Trevor", 123456, 1000);

        account1.deposit(100);
        account2.deposit(200);
        account3.deposit(938);

        account1.withdraw(19);
        account2.withdraw(28);
        account3.withdraw(100);

        System.out.println("Account 1 balance: " + account1.balance);
        System.out.println("Account 2 balance: " + account2.balance);
        System.out.println("Account 3 balance: " + account3.balance);
        System.out.println("I am so sorry Higgins, this is the worst code I've ever written.");

    }



    
}
