package entities;

public class User {

    // Variables
    private int accountID;
    private String holder;
    private double balance;

    // Constructors
    public User(){
    }
    public User(int accountID, String holder){
        this.accountID = accountID;
        this.holder = holder;
    }
    public User(int accountID, String holder, double initialDeposit){
        this.accountID = accountID;
        this.holder = holder;
        addCash(initialDeposit);
    }

    // Getters
    public int getAccountID() {
        return accountID;
    }
    public String getHolder() {
        return holder;
    }

    // Setters
    public void setHolder(String holder) {
        this.holder = holder;
    }

    // Methods
    public void addCash(double deposit){
        balance += deposit;
    }
    public void removeCash(double withdraw){
        balance -= withdraw + 5.0;
    }

    // Output
    public String toString(){
        return
                "Account ID: " + getAccountID()
                        + "\nAccount Holder: " + getHolder()
                        + "\nBalance: US$ " + String.format("%.2f", balance);
    }
}
