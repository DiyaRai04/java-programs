// Write a Java program to iterate a linked list in reverse order (using
// objlist.descendingIterator())

package linkedlist1;
import java.util.Iterator;
import java.util.LinkedList;
public class Iteratereverse {
	 public static void main(String[] args) {
	     
	        LinkedList<String> colors = new LinkedList<>();
	        
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Black");
	        
	     
	        Iterator<String> iterator = colors.descendingIterator();
	     
	        System.out.println("Iterating through the list in reverse order:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


