import java.util.Scanner;


public class convert {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What do you want to convert?");
		System.out.println("Available conversions:");
		System.out.println("- Type 0 for miles to feet -");
		System.out.println("- Type 1 twice for centimeters to inches -");
		System.out.println("- Type 2 thrice for feet to inches -");
		
		System.out.println("Value: ");
		
		 if(scanner.nextInt() == 0) 
		 {
			System.out.println("Enter amount of miles:");
			System.out.println("The amount of feet is: " + mileToFt(0));
			System.out.println("|---------------------------|");
		 }
		 else if(scanner.nextInt() == 1)
		 {
			System.out.println("Convert yard to feet: ");
			System.out.println("The amount of feet is: " + yrdToFt(0) );
			System.out.println("|---------------------------|");
		 }
		 else if (scanner.nextInt() == 2) 
		 {
			System.out.println("Convert feet to inches: ");
			System.out.println("The amount of feet is: "+ cmToIn(0) );
			System.out.println("|---------------------------|");
		 }
	}

	
	public static int cmToIn(int inches) // method for return centimeters from inches
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
	
}
