//Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)

package Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class Sortcolour {
	   public static void main(String[] args) {
		      
	        ArrayList<String> colors = new ArrayList<>();
	        

	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Black");
	        
	    
	        Collections.sort(colors);
	        
	        
	        System.out.println("Sorted color list: " + colors);
	    }
	}


