import java.util.Scanner;


public class convert {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// put a for loop here 
		
		for (int i = 0; i < 10; i++)	// run through the conversions 10 times - 0,1,2,3,4,5,6,7,8,9 = 10
		{
			
		
			System.out.println("What do you want to convert?");
			System.out.println("Available conversions:");
			System.out.println("- Type 0 for miles to feet -");
			System.out.println("- Type 1 for yard to feet -");
			System.out.println("- Type 2 for feet to inches -");
			System.out.println("- Type 3 for centimeters to inches");
		
			System.out.println("Value: ");
		
			int input = scanner.nextInt();
		
		
				if (input > 3 || input < 0) {
				
					System.out.println("Invalid value, try again.");
				}
				else if (input == 0) { 				 
				
					System.out.println("Enter amount of miles:");
					System.out.println("The amount of feet is: " + mileToFt(0));
					System.out.println();
					System.out.println("|---------------------------|");
				}
				else if (input == 1) {			 
				
					System.out.println();
					System.out.println("Convert yard to feet: ");
					System.out.println("The amount of feet is: " + yrdToFt(0) );
					System.out.println();
					System.out.println("|---------------------------|");
				}
				else if (input == 2) { 		 
				
					System.out.println("Convert feet to inches: ");
					System.out.println("The amount of inches is: "+ ftToIn(0) );
					System.out.println("|---------------------------|");
				}
		
				else if (input == 3) {	
				
					System.out.println("Convert centimeters to inches: ");
					System.out.println("The amount of inches is: " + cmToIn(0));
					System.out.println("|---------------------------|");

				}
		 
		 System.out.println();
		
		}
		 
	}

	
	public static int ftToIn(int inches) // method for return centimeters from inches
	{
		Scanner s1 = new Scanner(System.in);
		
		int feet = s1.nextInt();
		inches = (feet * 12); 
		return inches;
	}
	
	public static int yrdToFt(int feet) // method for returing feet from yards
	{
		Scanner s2 = new Scanner(System.in);

		int yard = s2.nextInt();
		feet = (yard * 3);
		return feet;
	}
	
	public static int mileToFt(int feet)
	{
		Scanner s3 = new Scanner(System.in);

		int mile = s3.nextInt();
		feet = (mile * 5280);
		return feet;
	}
	
	public static double cmToIn(double inches)
	{
		Scanner s4 = new Scanner(System.in);
		
		double centimeter = s4.nextInt();
		inches = (centimeter / 2.54);
		
		return inches;
	}
	
	
}
