//package ChristopherLee_LUAssessmentTask1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
@author Christopher Lee 
@date 1/5/21

@purpose This Shapes class contains the blueprints for our shapes object additional patterns will inherit

@reference https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/?ref=leftbar-rightbar 
*/

public class Shape {
  // height, row, label, label offset -> shape
    protected int height,row,labelOffset; //offset is used to determine the spaces for the label to be printed
    protected String label;

    //constructor
    public Shape(String label, int height) {
      this.label = label;
      this.height = height;
    }
    //print function
    public void print() {
    	System.out.println("Shape"); 
    }

    //Getters Setters
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getLabelOffset() {
		return labelOffset;
	}

	public void setLabelOffset(int labelOffset) {
		this.labelOffset = labelOffset;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	  /**
	     * returns the row where the label will be printed 
	     * string label, int height -> int row
	     */
	public int selectRow(String label, int height) {
		Scanner scan = new Scanner(System.in);
		//initialize selected row
		int selectedRow =-1;
		//while loop until we get a valid row that is between 4 and the height
		while(selectedRow  <1 || selectedRow > height) {
			System.out.println("What row should I print \"" + label + "\" (0 for default)? ");
			try {
		    	  selectedRow = scan.nextInt();
		    	  if(selectedRow <1 || selectedRow > height){
		    		  System.out.println("Invalid row. Please enter a positive integer within the range of 1-" + height + " or 0 for default");
		    		  }
            //set the default to 4
            if(selectedRow==0){
              selectedRow = 4;
            }
		        }
		        //catch if height is mismatched input
		      catch(InputMismatchException e) {
		    	  System.out.println("Invalid row. Please enter a positive integer within the range of 1-" + height);
		    	  }
            //scan.nextLine();
		}
		
	//	scan.close();
		return selectedRow;
	    }

}