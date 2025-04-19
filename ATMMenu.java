import java.util.Scanner;
public class ATMMenu {
	public static void main(String[] args) {
		double Balance= 1000, Deposit,Withdraw;
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the card in given slot");
		System.out.println("1. Check balance. \n2.Deposit. \n3.Withdraw.");
		int choice = Input.nextInt();
		switch(choice)
		{
		   case 1 : 
		   System.out.println("Your Balance Amount : ",+Balance);
		   break;
		   case 2 :
		   System.out.println("Enter your Deposit Amount");
		   Deposit = Input.nextDouble();
		   Balance += Deposit;
		   System.out.prinln("Your Balance Amount "+Balance);
		   break;
		   case 3: 
		   System.out.println("Enter your Withdraw Amount");
		   Withdraw = Input.nextDouble();
		   if(Withdraw <= Balance){
		       Balance -= Withdraw;
		       System.out.println("Your current balance",+Balance);
		   } 
		   else
		   System.out.println("Insufficient Balance");
		   break;
		   default :
		   System.out.println("Enter your choice");
		   break;
		   		}	    
	}
}