// Write a java program for getting different colors through ArrayList interface and delete nth
// element from the ArrayList object by using remove by index



package Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class deletenthelement {
	 public static void main(String[] args) {
	        
	        ArrayList<String> colors = new ArrayList<>();
	        
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Black");
	        
	        
	        int n = 4; 
	        
	   
	        if (n - 1 >= 0 && n - 1 < colors.size()) {
	            colors.remove(n - 1);
	            System.out.println("Updated color list after removing element at index " + (n - 1) + ": " + colors);
	        } else {
	            System.out.println("Invalid index, unable to remove element.");
	        }
	    }
	}


