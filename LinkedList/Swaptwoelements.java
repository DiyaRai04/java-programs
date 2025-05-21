package linkedlist1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
public class Swaptwoelements {





    public static void main(String[] args) {
                LinkedList<String> colors = new LinkedList<>();
        
       
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("Pink");
        
       
        Collections.swap(colors, 0, 2);
        
      
        System.out.println("Updated color list after swapping first and third elements: " + colors);
    }
}

