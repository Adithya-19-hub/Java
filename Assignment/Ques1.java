package Assignment;

class BankAccount {
    int currentBalance;
    int updatedCurentBalance;
    int userRequestedAmount;

    // Constructor help's to initialize the value for the property.
    BankAccount(int val) {
        currentBalance = val;
    }

    // Method - 1 is to fetch's the current balance
    public int fetchBalance() {
        return currentBalance;
    }

    // Method - 2 is to withdraw amount from currentBalance.
    public void withdrawBalance(int withdrawAmount) {
        userRequestedAmount = withdrawAmount;
        if (currentBalance < userRequestedAmount) {
            System.out.println("Dear user, your requested withdrawAmount " + userRequestedAmount
                    + " is more than the current balance");
        } else if (userRequestedAmount < 300) {
            System.out.println("Dear user, your requested withdrawAmount must be equal to or more than 300");
        } else {
            updatedCurentBalance = currentBalance - userRequestedAmount;
            System.out.println("Dear user, your amount " + userRequestedAmount + " has been sucessufully withdrawn");
            System.out.println("Final current Balance: " + (updatedCurentBalance));
        }
    }

    // Method - 3 is to deposite the balance
    public void depositeBalance(int addAmount) {
        if (addAmount == 0 || addAmount < 0) {
            System.out.println("Dear user, your requested deposite amount is lesser than the 0 or equal to the zero");
        } else {
            System.out.println(addAmount + " adding to the current balance");
            if (currentBalance < userRequestedAmount || userRequestedAmount < 300) {
                System.out.println("Final amount after adding: " + (addAmount + currentBalance));
            } else {
                System.out.println("Final amount after adding: " + (addAmount + updatedCurentBalance));
            }
        }
    }
}

public class Ques1 {
    public static void main(String[] args) {
        // Instance of class
        BankAccount sbi = new BankAccount(10000);
        System.out.println("Current Balance is " + sbi.fetchBalance());
        sbi.withdrawBalance(1000);
        sbi.depositeBalance(10000);
    }
}