import java.util.Scanner;

public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        final int DOOR = 20;
		  final int WINDOW = 15;    
		  //declare integers length, width, and height;
		  int length, width, height, doors, windows;
		  //declare double totalSqFt;
		  double totalSqFt;
        //declare double paintNeeded;
		  double paintNeeded;
	     //declare and initialize Scanner object
		  Scanner scan = new Scanner (System.in);
		  //Prompt for and read in the length of the room
		  // finish this -- length = 
		  System.out.print("Enter the length of the room: ");
		  length = scan.nextInt();
		  //Prompt for and read in the width of the room
        System.out.print("Enter width: ");
		  width = scan.nextInt();
        //Prompt for and read in the height of the room
		  System.out.print("Enter height: ");
		  height = scan.nextInt();
        //Prompt for and enter the number of doors    
		  System.out.println("Enter the number of doors: ");
		  doors = scan.nextInt();
		  //Prompt for and enter the number of windows
		  System.out.println("Enter the number of windows: ");
		  windows = scan.nextInt();
		  //Compute the total square feet to be painted--think
    	  //about the dimensions of each wall
        totalSqFt = 2 * width * height + 2 * length * height - DOOR*doors - WINDOW*windows;
        //Compute the amount of paint needed
        paintNeeded = totalSqFt / COVERAGE;
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
		  System.out.println("Length= " + length + "\nWidth= " + width +  "\nHeight= " + height + "\nNumber of doors: " + doors + "\nNumber of windows: " + windows + "\nGallons of Paint Needed= " + paintNeeded);
		  
    }
}
