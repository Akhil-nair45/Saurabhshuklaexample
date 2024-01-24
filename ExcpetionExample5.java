package Saurabhshuklaexample;
public class ExceptionExample5 {
    public static void main(String[] args) {
        int balance = 5000;
        int withdrawal = 6000;

        if(balance<withdrawal)
        {
            throw new ArithmeticException("Insufficient Balance");
        }

        System.out.println("Transaction Successful");
        System.out.println("Thank You");
    }
}
