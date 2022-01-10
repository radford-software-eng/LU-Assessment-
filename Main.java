//package ChristopherLee_LUAssessmentTask1;
/**
@author Christopher Lee 
@date 1/5/21

@Purpose Liberty University Java Developer Assessment Test

Task 1: Write a simple Java or C# program that draws ASCII shapes
*/
//scanner and input mismatch is used to capture and validate input
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main{

  //Main Method
  public static void main(String[] args) {
    System.out.println("Hello world!");
    menu();

  }

  //menu method will be used primarily for I/O
  public static void menu(){
    
    //variable declarations
        String pattern,label = null;  //will be used to store our shape
        int height;
        Shape shape;
        Scanner scan = new Scanner(System.in); //scanner to handle input
        //do while loop ends if user enters quit 
        do {
          System.out.println("Please enter a shape (triangle, square, or diamond) (quit to end)");
          pattern = scan.nextLine(); //take in input
          
            switch (pattern) {
              
              case "triangle":
            	  height = getHeight(pattern);//get height of triangle
            	  label = getLabel(pattern);//get input for label
            	  //initialize triangle shape object and print
            	  shape = new Triangle(label,height);
                shape.print();
            	  
              break;
              
              case "square":
            	  //get height of square
            	  height = getHeight(pattern);
            	  //get label
            	  label = getLabel(pattern);
            	  //initialize square shape object and print
            	  shape = new Square(label,height);
                shape.print();
              break;
              
              case "diamond":
               //get height of square
            	  height = getHeight(pattern);
            	  //get label
            	  label = getLabel(pattern);
            	  //initialize diamond shape object and print
            	  shape = new Diamond(label,height);
                shape.print();
            	  //printDiamond();                   
              break;

               // case "M":
                    // Add any additional shape cases here
            }
        } while (!pattern.equals("quit")); // quitting the program


        scan.close(); //close scanner to prevent resource leaks

  }


  /**
   *return method to get valid user input for height that is 4 or greater
   string shape-> int height
   * */
  public static int getHeight(String pattern){
    
    Scanner scan = new Scanner(System.in);
    
    int height = -1;
    //while loop to check if height is a positive integer
    while(height < 4) {
      System.out.printf("Enter the height of the %s:\n",pattern);
      try {
    	  height = scan.nextInt();
    	  if(height < 4){
    		  System.out.println("Invalid height. Please enter a positive integer (4 or greater): ");
    		  }
        }
        //catch if height is mismatched input
      catch(InputMismatchException e) {
    	  System.out.println("Invalid height. Please enter a positive integer (4 or greater): ");
    	  }scan.nextLine();
         
    }   
    return height; //return our height

  }

  /**
   * return method to get valid user input for the label to print onto our shape pattern
   * if empty default return "LU"
   **/
  public static String getLabel(String pattern) {
      String label;
      Scanner scan = new Scanner(System.in);
      //ask for input
      System.out.println("What label should I print on the " + pattern + " (Leave Blank for \"LU\")?");
      label = scan.nextLine();

      //if empty default is LU
      if (Objects.equals(label, "")) {
          label = "LU";
      }
      return label;
  }
  


}