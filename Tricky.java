import java.util.*;
public class Main {
	public static void main(String[] args) {
	System.out.println("Select your option\n1.Is prime\n2.Reverse A number\n3.Palondrome Check\n4.Armstrong Number check \n5.Fibaonacci Series\n6.Pattern");
	int Choice,Number,Digit,Reversed=0,A=0,B=1,C,i,j,Result=0,Original,NSeries;
	boolean isPrime = true;
	Scanner Input = new Scanner(System.in);
	Choice = Input.nextInt();
	switch(Choice)
	{
	    case 1:
	    {
	        System.out.println("Enter your Number");
	        Number =Input.nextInt();
	        if(Number <= 1)
	        break;
	        else
	        {
	            for (i=2;i<=Math.sqrt(Number);i++)
	            {
	                if(Number % i ==0){
	                    isPrime = false;
	                    break;
	                }
	            }
	            System.out.println(Number +"is Prime?"+ isPrime);
	        }
	        break;
	    }
	    case 2:
	    {
	           System.out.println("Enter your Number");
	           Number = Input.nextInt();
	           while(Number != 0)
	           {
	               Digit = Number %10;
	               Reversed = Reversed *10+  Digit;
	               Number /= 10;
	               }
	            System.out.println("Reversed Number is "+ Reversed);
	            break;
	     }  
	     case 3 :
	     {
	               System.out.println("Enter your Number");
	              Number = Input.nextInt();
	                Original = Number;
	                while(Number != 0)
	                {
	                    Digit = Number %10;
	                    Reversed = Reversed *10 + Digit;
	                    Number /=10;
	                }
	                System.out.println(Original == Reversed ?  "Palindrome Number ":"Not a Palindrome"); 
	     }
	     break;
	     case 4 :
	     {
	              System.out.println("Enter your Number");
	              Number = Input.nextInt();
	              Original = Number ;
	              while(Number !=0)
	              {
	                  Digit = Number %10;
	                  Result += (Digit * Digit * Digit);
	                  Number /=10;
	              }
	              System.out.println(Original==Result ? "Given number is a Armstrong": "Not a Armstrong");
	           }
	           break;
	           case 5:
	           {
	              System.out.println("Enter your Number");
	              NSeries = Input.nextInt();
	              
	              System.out.println("Fibonacci series of "+NSeries+" : "+A+","+B+",");
	              for(i =3;i<=NSeries;i++)
	              {
	                  C=A+B;
	                  System.out.println(C+",");
	                  B = A;
	                  C = B;
	              }
	           }
	           break;
	           case 6:
	           {
	               for ( i = 0; i < 3; i++) {
                    for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
                }
                System.out.println("");
	           }
	           break;
	           default :
	           System.out.println("Undefined Element Selection Error Occured");
	           break;         
	           }  
	}
}