import java.util.Scanner;
public class MultiCalc{
	public static void main(String[] args) {
		double Sum =0,Sub =0,Number,Result =1, RootValue,i,Base,Power,Fact;
		Scanner Input = new Scanner(System.in);
		System.out.println("Select the menu \n 1.Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Sqrt \n 6. Perfect Square \n 7.Cube \n 8.Perfect Cube\n 9. Power Value \n 10.Factorial");
		int choice =Input.nextInt();
		switch(choice)
		{
		    case 1 :
		    {
		        System.out.println("Enter numbers to add (enter '=' to calculate):");
		        while (true) {
		            String entry = Input.next();
		            if (entry.equals("=")) 
		            {
		                break;
                    }
                    else
                    {
                        Number = Double.parseDouble(entry);
                        Sum += Number;
                     }
             }
            System.out.println("Total sum = " + Sum);
            break;
		    }
		    case 2 :
		    {
		        System.out.println("Enter numbers to subtract(enter '=' to calculate):");
		        while (true) {
		            String entry = Input.next();
		            if (entry.equals("=")) 
		            {
		                break;
                    }
                    else
                    {
                        Number = Double.parseDouble(entry);
                        Sub += Number;
                     }
             }
            System.out.println("Total sub = " + Sub);
            break;
		    }
		    case 3 :
		    {
		        System.out.println("Enter numbers to Multiply (enter '=' to calculate):");
		        while (true) {
		            String entry = Input.next();
		            if (entry.equals("=")) 
		            {
		                break;
                    }
                    else
                    {
                        Number = Double.parseDouble(entry);
                        Multi *= Number;
                     }
             }
            System.out.println("Total multiply= " + Multi);
            break;
		    }
		    case 4 : 
		    {
		        System.out.println("Enter the number");                double Value = Input.nextDouble();
		        System.out.println("Enter the divider");
		        double Divider = Input.nextDouble();
		        Result = Value / Divider;
		        System.out println("Divident value "+Result);
		        break;   
		    }
		    case 5 :
		    {
		        System.out.println("Enter the root value: ");
		        RootValue = Input.nextDouble();
		        Result = RootValue * RootValue;
		        System.out.println("Square root of "+ RootValue +":   "+ Result);
		        break;
		    }
		    case 6 :
		    {
		       boolean IsPerfectSquare = false;
		        System.out.println("Enter the root value:");
		        RootValue = Input.nextDouble();
		        for(i =0;i<RootValue;i++)
		        {
		            Result = i*i;
		            if(Result == RootValue){
		            System.out.println("Perfect Square root of "+RootValue +"is "+i);
		            IsPerfectSquare= true;
		            }
		        }
		           if(!IsPerfectSquare)
		            System.out.println("Given Value is not a Square Root Value");
		        break;
		    }
		    
		    
		     case 7:
		    {
		        System.out.println("Enter the root value: ");
		        RootValue = Input.nextInt();
		        Result = RootValue * RootValue * RootValue;
		        System.out.println("Cube root of "+ RootValue +":   "+ Result);
		        break;
		    }
		    case 8 :
		    {
		       boolean IsPerfectCube = false;
		        System.out.println("Enter the root value:");
		        RootValue = Input.nextDouble();
		        for(i =0;i<RootValue;i++)
		        {
		            Result = i*i*i;
		            if(Result == RootValue){
		            System.out.println("Perfect Cube root of "+RootValue +"is "+i);
		            IsPerfectCube = true;
		            }
		        }
		           if(!IsPerfectCube)
		            System.out.println("Given Value is not a Cube Root Value");
		        break;
		    }
		    case 9 :
		    {
		        System.out.println("Enter the base value :");
		        Base = Input.nextDouble();
		        System.out.println("Enter the Power value : ");
		        Power = Input.nextDouble();
		        for(i =0;i<Power;i++){
		            Result *= Base;
		        }
		        System.out.println(Base + " Power of "+Power + "is"+Result);
		        break;
		    }
		    case 10:
		    System.out.println("Enter the value to find factorial");
		    Fact = Input.nextDouble();
		    for (i =1;i<=Fact;i++)
		    {
		        Result *= i;
		    }
		    System.out.println("Factorial of "+Fact+ " is "+Result);
		    break;
		}
		        
	}
}