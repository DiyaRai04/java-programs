// Write a Java program to insert the specified element at the end of a linked list.( using
// l_listobj.offerLast("Pink"))

package linkedlist1;
import java.util.Iterator;
import java.util.LinkedList;
public class Insertatend {
	 public static void main(String[] args) {
	       

	  LinkedList<String> colors = new LinkedList<>();
      
      
      colors.add("Blue");
      colors.add("Green");
      colors.add("Red");
      colors.add("Yellow");
      colors.add("Black");
      
 
      colors.offerLast("Pink");
      
      
      System.out.println("Updated color list: " + colors);
  }
}



