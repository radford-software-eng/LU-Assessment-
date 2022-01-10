//package ChristopherLee_LUAssessmentTask1;
/**@author Christopher Lee
 * 
 * @purpose this class is a subclass of Square and will inherit shape class and methods
 * */

public class Square extends Shape {
  
  //Constructor call our parent class 
  public Square(String label, int height) {
    super(label,height);
    //get input for the row to print label and set the row
    setRow(selectRow(label, height));
    //set the offset
    setLabelOffset((height - label.length()) / 2);
    }
    
    /*print square shape to console
    public void print(){

      int height = getHeight("square");//pass in our shape
      for(int i = 0; i<height;i++){
        System.out.println(' ');
        //nested loop will print out the width of the square
        for(int j=0; j<height; j++){
          System.out.print("X ");
        }
      }
      System.out.println(' ');   
    }*/
  public void print() {
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < height; x++) {
        //check row and print label
        if (y == row - 1 && (x >= labelOffset && x < label.length() + labelOffset)) {
          System.out.print(label.charAt(x - labelOffset) + " ");
                }
        else {
          System.out.print("X ");//print the pattern
                }
            }
            System.out.println();
        }
    }
}