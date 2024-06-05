import java.util.Scanner;
public class Online_Quiz_Platform {
    int bank_amount=5000;
    Scanner sc=new Scanner(System.in);
    public void Display(){
        System.out.println("Welcome to the World Health BANK");
        System.out.println("Enter what Operation you want to perform \n a) Withdraw b) Deposit c) Check Balancce ");
        String operation=sc.nextLine();
        if (operation.equalsIgnoreCase("Withdraw")) {
            Widthdraw();
        }
        else if (operation.equalsIgnoreCase("Deposit")) {
            Deposit();
        }
        else{
            Check_Balance();
        }


    }
    public void Check_Balance(){
        System.out.println("The Balance is Available in your Account is "+bank_amount);
    }
    public void Widthdraw(){
        System.out.println("Enter the amount you want to withdraw :");
        int amount=sc.nextInt();
        if (amount<bank_amount) {
             bank_amount=bank_amount-amount;
             System.out.println("successfully Withdraw money "+amount+ "Rupess ......!");
        }
        else{
            System.out.println("having insufficient amount in your account ");
        }
    }
    public void Deposit(){
        int amount=sc.nextInt();
        bank_amount+=amount;
        System.out.println(" Now your New Amount in Your Account is "+bank_amount);
    }
    public static void main(String[] args) {
        Online_Quiz_Platform obj=new Online_Quiz_Platform();
        obj.Display();
        
    }
}
