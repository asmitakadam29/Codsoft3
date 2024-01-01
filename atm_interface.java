/**
 * atm_interface
 */
import java.util.Scanner;
class atm{
    float balance;
    int pin=1234;

    public void checkpin(){
        System.out.print("enter the pin:");
        Scanner sc =new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if(enteredpin == pin)
        {
            menu();
        }
        else{
            System.out.println("please enter valid pin");
        }
    }

    public void menu(){
        System.out.println("enter your choice:");
        System.out.println("1.check A/c balance");
        System.out.println("2.withdraw money");
        System.out.println("3.Deposit money");
        System.out.println("4.exit");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt==1){
            checkbalance();
        }
        else if(opt==2){
            withdraw();
        }
        else if(opt==3){
            deposit();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("inavalid choice");
        }


        
    }

    public void checkbalance(){
          System.out.print("balance:" + balance);
          menu();
    }

    public void withdraw(){
        System.out.println("enter amount to withdraw");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("insufficient amount");
        }
        else{
            balance=balance-amount;
            System.out.println("money withdraw successfully");
            menu();
        }
    }

    public void deposit(){
        System.out.println("enter the amount");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("amount deposited successfully");
        menu();
    }
}
public class atm_interface {
    public static void main(String[] args) {
        atm obj=new atm();
        obj.checkpin();
    }
}


