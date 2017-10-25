import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    public static int numberOfAccounts = 0;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
        numberOfAccounts += 1;
    }

    public void setAccountNumber(int a) {
        accountNumber = a;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountBalance(double b) {
        accountBalance = b;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }
    public void setOwnerName(String name) {
        ownerName = name;
    }





    /*
     * Implement getters and setters as appropriate for private variables.
     */
}