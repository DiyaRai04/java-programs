// Write a Java program to display elements and their positions in a linked list ( using
// l_listobj.get(p) )


package linkedlist1;

import java.util.LinkedList;
public class Displayelementwithposition {





    public static void main(String[] args) {
      
        LinkedList<String> colors = new LinkedList<>();
        
      
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Pink");
        
               System.out.println("Elements and their positions in the linked list:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }
}
