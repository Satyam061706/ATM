import java.util.*;

public class aaa {
    Scanner sc = new Scanner(System.in);
    int id = 1234;
    int password = 1234;
    double amount = 5000;
    int withdrawlAmount;
    int depositAmount, transaction, transferAmount;

    void login() {
        System.out.println("* * * * * * welcome * * * * * *");

        System.out.println("Enter your customer id:");
        id = sc.nextInt();
        System.out.println("Enter your password:");
        password = sc.nextInt();

        if (id == 1234 && password == 1234) {
            System.out.println("* * * * Login Successful * * * *");
            menu();
        } else {
            System.out.println("Login failed try again!!");
            login();
        }
    }

    void menu() {
        int ch;
        do {
            System.out.println("Select your choice: \n1.Transaction history\t2.Withdraw ");
            System.out.println("3.Deposit \t\t\t\t4.Transfer \n5.View balance \t\t\t6.Quit");
            System.out.println("* * * * * * * * * * * * * * *");
            System.out.println("Enter choice:");
            System.out.println("* * * * * * * * * * * * * * *");
            ch = sc.nextInt();
            System.out.println("* * * * * * * * * * * * * * *");
            switch (ch) {
                case 1:
                    Transactionhistory();
                    break;
                case 2:
                    Withdrawl();
                    break;
                case 3:
                    Deposit();
                    break;
                case 4:
                    Transfer();
                    break;
                case 5:
                    viewBalance();
                    break;
                case 6:
                    System.out.println("\t\t\t EXIT \t\t\t");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }
        while (ch <= 6);
    }

    void Transactionhistory() {
        if (transaction > 0) {
            System.out.println("You deposited Rs." + transaction);
            System.out.println("* * * * * * * * * * * * * * *");
        } else if (transaction < 0) {
            System.out.println("You withdrawn Rs." + (-1 * transaction));
        } else {
            System.out.println("You have not done any transaction yet");
            System.out.println("* * * * * * * * * * * * * * *");
        }
    }

    void Withdrawl() {
        System.out.print("Enter withdraw Amount:");
        withdrawlAmount = sc.nextInt();
        System.out.println("\n* * Withdrawl successful * *\n");
        System.out.println("Remaining balance:" + ((amount + depositAmount) - withdrawlAmount));
        System.out.println("* * * * * * * * * * * * * * *");
        transaction = withdrawlAmount;
    }

    void Deposit() {
        System.out.print("Enter deposit Amount:");
        depositAmount = sc.nextInt();
        System.out.println("\n* * * Deposit Sccessful * * *\n");
        System.out.println("Available balance:" + ((amount - withdrawlAmount) + depositAmount));
        System.out.println("* * * * * * * * * * * * * * *");
        transaction = depositAmount;
    }

    void Transfer() {
        System.out.print("Enter transfer amount:");
        transferAmount = sc.nextInt();
        if (transferAmount > 2000) {
            System.out.println("* * * * Insufficient * * * *");
        } else
            System.out.println("* * Transfer Successful * *");
        System.out.println("* * * * * * * * * * * * * * *");
    }

    void viewBalance() {
        double c = (amount - withdrawlAmount) + depositAmount;
        System.out.println("Amount available:" + c);
        System.out.println("* * * * * * * * * * * * * * *");
    }
}

class Exam {
    public static void main(String[] args) {
        aaa s = new aaa();
        s.login();
    }
}