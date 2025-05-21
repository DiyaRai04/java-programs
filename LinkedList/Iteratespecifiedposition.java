package linkedlist1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class Iteratespecifiedposition {
	 public static void main(String[] args) {
         LinkedList<String> colors = new LinkedList<>();
  
  
  colors.add("Blue");
  colors.add("Green");
  colors.add("Red");
  colors.add("Yellow");
  colors.add("Black");
  

  Iterator<String> iterator = colors.listIterator(1);
  

  System.out.println("Iterating through the list starting from the 2nd position:");
  while (iterator.hasNext()) {
      System.out.println(iterator.next());
  }
}
}



