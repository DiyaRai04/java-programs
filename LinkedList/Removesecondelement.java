package Arraylist;
import java.util.ArrayList;
public class Removesecondelement {
	 public static void main(String[] args) {
	       
	        ArrayList<String> colors = new ArrayList<>();
	        
	      
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Black");
	        

	        if (colors.size() > 1) {
	            colors.remove(1);
	        }
	        
	        
	        colors.remove("Blue");
	        
	        
	        System.out.println("Updated color list: " + colors);
	    }
	}



