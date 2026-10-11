class Account {
    private String accNo;
    private int balance;
    int currentBalnce;


    // Setter to initialize the private member's
    public void setValues(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Method to deposit amount to the current balance.
    void deposit(int addBalance) {
        if (addBalance <= 0) {
            System.out.println("Dear User, Your deposite balance is less than or equal to zero");
        }
        else {
            currentBalnce = balance + addBalance;
            System.out.println("Dear User, Amount is getting deposited....");
            System.out.println("Deposited Amount: " + currentBalnce);
        }
    }
    
    
    // Method to withdraw amount from the current balance.
    void withDraw(int takeAmount) {
        if(takeAmount <= 0 || takeAmount > currentBalnce) {
            System.out.println("Dear User, Your withdrawal requested amount exceeded than the current balance or insufficient");
        }
        else {
            currentBalnce = currentBalnce - takeAmount;
            System.out.println("Dear User, Your amount is withdrawn succesufully with:" + takeAmount);
            System.out.println("Remaining amount after withdraw: " + currentBalnce);
        }
    }
}


class SavingsAccount extends Account {
    public int interestRate;

    void addInterest() {}
}


public class InheritanceQ {
    public static void main(String[] args) {
        // Mini question
        SavingsAccount obj = new SavingsAccount();
        obj.setValues("201234534522", 0);
        obj.deposit(1000);
        obj.withDraw(300);
        obj.withDraw(200);
        obj.withDraw(500);
        obj.withDraw(500);
    }
}