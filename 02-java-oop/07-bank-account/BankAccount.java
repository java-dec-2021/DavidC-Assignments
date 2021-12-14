public class BankAccount {
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    private static int numberOfAccounts = 0;
    private static double total = 0;

    public BankAccount() {
        numberOfAccounts++;
    }

    public BankAccount(double initialDeposit) {
        this.checkingBalance = initialDeposit;
        total += initialDeposit;
        numberOfAccounts++;
    }

    public BankAccount(double initialCheckingDeposit, double initialSavingsDeposit) {
        this.checkingBalance = initialCheckingDeposit;
        this.savingsBalance = initialSavingsDeposit;
        total = initialCheckingDeposit + initialSavingsDeposit;
        numberOfAccounts++;
    }

    public double getCheckingBalance() {
        System.out.println("Checking Balance : " + TwoDecimals(this.checkingBalance) );
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        System.out.println("Savings Balance : " + TwoDecimals(this.savingsBalance) );
        return this.savingsBalance;
    }

    private static String TwoDecimals(double d) {
        return String.format("%.2f",d);
    }

    public void checkingDeposit(double deposit) {
        this.checkingBalance += deposit;
        total += deposit;
        System.out.println("Deposit : " + TwoDecimals(deposit) );
        System.out.println("Checking Balance : " + TwoDecimals(this.checkingBalance) );
    }

    public void savingsDeposit(double deposit) {
        this.savingsBalance += deposit;
        total += deposit;
        System.out.println("Deposit : " + TwoDecimals(deposit) );
        System.out.println("Savings Balance : " + TwoDecimals(this.savingsBalance) );
    }

    public void checkingWithdrawal(double withdrawal) {
        if (withdrawal > this.checkingBalance) {
            System.out.println("Transaction cancelled : Insufficient Funds");
        } else {
            this.checkingBalance -= withdrawal;
            total -= withdrawal;
        }
        System.out.println("Withdrwal : " + TwoDecimals(withdrawal) );
        System.out.println("Checking Balance : " + TwoDecimals(this.checkingBalance) );
    }

    public void savingsWithdrawal(double withdrawal) {
        if (withdrawal > this.savingsBalance) {
            System.out.println("Transaction cancelled : Insufficient Funds");
        } else {
            this.savingsBalance -= withdrawal;
            total -= withdrawal;
        }
        System.out.println("Withdrwal : " + TwoDecimals(withdrawal) );
        System.out.println("Savings Balance : " + TwoDecimals(this.savingsBalance) );
    }

    public static void GetTotal() {
        System.out.println("Total Balance on all Accounts : " + TwoDecimals(total) );
        
    }
}