public class ATMPinAuthentication{
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter your 4-digit PIN number ");
		int UserPin[],CardNumber[];
		System.out.println("1. Set up your card \n 2. Pin Number Validation");
		int choice = Input.nextInt();
		switch(Choice)
		{
		    case 1 :
		    {
		        System.out.println("Enter your card Number :\n");
		        CardNumber = Input.nextInt();
		        System.out.println("Set your 4-digit PIN number");
		        UserPin = Input.nextInt();
		        System.out.println("Card Number : "+ CardNumber+"\nUser Pin Number : "+UserPin+"!!!  Don't Share Your Account Details With Anyone \n Be Aware of Fradulents. !!!");
		    }
		    case 2 : 
		    {
		        System.out.println("Enter your card Number : \n");
		        CardNumber = Input.nextInt();
		        for( int i =0; i< CardNumber.length;i++)
		        {
		            if(CardNumber == CardNumber[i] ){
		                for (int j = 0; j<3;j++)
		                {
		                System.out.println("Enter your PIN :\n");
		                UserPin = Input.nextInt();
		                if(UserPin == UserPin[i])
		                {
		                    System.out.println("Valid Card ");
		                    System.exit(0);
		                }
		                else 
		                {
		                    System.out.println("Invalid Pin Number, Enter Again");
		                }
		            }
		            System.out.println("After 3 Unsuccessful attempts your card is locked");
		            System.exit(0);
		            }
		            else 
		            {
		                System.out.println("Enter valid card number  ");
		                System.exit(0);
		            }
		        }
		    }
		    break;
		    default :
		    {
		        System.out.println("Enter correct choice");
		        break;
		    }
		    
		
	}
}