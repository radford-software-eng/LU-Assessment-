//package ChristopherLee_LUAssessmentTask1;

/**@author chris lee
 * {@summary subclass triangle extends and will inherit methods and instances of the shape class}
 * */

public class Triangle extends Shape {
		
	//constructor reference our parent class  
	public Triangle(String label, int height) {
		super(label, height);
    //get user input for the row to print the label
    setRow(selectRow(label, height));
    //set the offset of spaces where our label will be printed
    setLabelOffset((row - label.length()) / 2);

	}

	/*print triangle shape method 
	public static void print(int height, String label, int labelOffset){
    //pass in our shape and grab the height
    for (int i = 1; i <= height; i++) {
      // loop to print the number of spaces before the star
	    for (int j = height; j >= i; j--) {
        System.out.print(" ");
	        }
          // loop to print the number of stars in each row
	      for (int j = 1; j <= i; j++) {          
	        System.out.print("X ");
	            }
	            // for new line after printing each row
	            System.out.println();
	        }
	    
	  }*/
    public void print() {
        for (int y = 0; y <= height; y++) {
          for (int space = height - y; space > 0; space--) {
          //spaces needed for triangle to display correctly
          System.out.print(" ");
        }
          for (int x = 0; x < y; x++) {
            //print the label
            if (y == row && x - labelOffset < label.length() && x >= labelOffset && labelOffset >= 0) {
              System.out.print(label.charAt(x - labelOffset) + " ");
                } 
            else {              
               System.out.print("X ");//print the pattern
                }
            }
            //new line
            System.out.println();
        }
    }

}
