//package ChristopherLee_LUAssessmentTask1;

/**@author chris lee
 * {@summary subclass diamond extends and will inherit methods and instances of the shape class}
 * */

public class Diamond extends Shape {
	//since the diamond shape is essentially 2 triangle shapes one inverted and one on top we will need to split the height in two
	private int halfHeight,topHalfOffset,botHalfOffset;

    public Diamond(String label,int height) {
        //Calls Inherited constructor
        super(label,height);
        //check height and add 1 since it will have odd number of rows
        if (height % 2==0) {
            height = height + 1;
        }

        setHalfHeight((height / 2) + 1);
        //set the row to display the label
        setRow(selectRow(label, height - label.length() + 1));


        //set the offset for top and bottom halves of the diamond
        setTopHalfOffset((row - label.length()) / 2);
        setBotHalfOffset(((height + 1 - row - label.length()) / 2) + ((height + 1 - row - label.length()) % 2));
    }
    //getters and setters

	public int getHalfHeight() {
		return halfHeight;
	}

	public void setHalfHeight(int halfHeight) {
		this.halfHeight = halfHeight;
	}

	public int getTopHalfOffset() {
		return topHalfOffset;
	}

	public void setTopHalfOffset(int topHalfOffset) {
		this.topHalfOffset = topHalfOffset;
	}

	public int getBotHalfOffset() {
		return botHalfOffset;
	}

	public void setBotHalfOffset(int botHalfOffset) {
		this.botHalfOffset = botHalfOffset;
	}
    /*
    //print diamond shape method
  public static void printDiamond(){
    //pass in our shape and grab the height and split in half to keep track of top and bottom half of diamond
    int height = getHeight("diamond")%2;

    for (int i = 1; i <= height; i++) {
      //loop to print the number of spaces
      for (int j = height; j >= i; j--) {
        System.out.print(" ");
        }
      //loop to print the number of X for each row
      for (int j = 1; j <= i; j++) {          
        System.out.print("X ");
            }
            //new line after each row
            System.out.println();
        }
    //reset height to 0
    int space = 1;
    //reverse the triangle shape for a mirror copy
    for (int i = height; i >= 1; i--) {
      //loop to print the number of spaces
      for (int j = -1; j<space; j++) {
        System.out.print(" ");
        }
      //loop to print the number of X for each row
      for (int j = 1; j < i; j++) {          
        System.out.print("X ");
            }
            //new line after each row
            System.out.println();
            space++;
        }   
    
  }*/
  //print the shape   
  public void print() {
    //top half of diamond
    for (int y = 0; y < halfHeight; y++) {
      //print the spaces so the diamond is evenly spaced
      for (int space = halfHeight - y; space > 0; space--) {
        System.out.print("  "); 
            }
            for (int x = 1; x <= y; x++) {
              // print the label if on the correct row and on the top half
              if (y == row && x > topHalfOffset && x <= (topHalfOffset + label.length())) {
                System.out.print(label.charAt(x - topHalfOffset - 1) + "   ");
                } 
              else {
                System.out.print("X   ");//print pattern
                }
            }
            System.out.println();//new line
        }
        //print bottom half
        for (int y = halfHeight; y > 0; y--) {
          for (int space = halfHeight - y; space > 0; space--) {
            System.out.print("  ");
            }
            for (int x = 1; x <= y; x++) {
              // print label if on the correct row and on the bottom half
              if ((height + 1) - y == row && x > botHalfOffset && x <= (botHalfOffset + label.length())) {
                System.out.print(label.charAt(x - botHalfOffset - 1) + "   ");
                } 
                else {
                  System.out.print("X   "); 
                }
            }
            System.out.println();//new line
        }
    }


}