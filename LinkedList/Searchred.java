// Write a java program for getting different colors through ArrayList interface and search whether
// the color "Red" is available or not

package Arraylist;
import java.util.ArrayList;
public class searchred {
       
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		 
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        
       
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}





		
		

	


