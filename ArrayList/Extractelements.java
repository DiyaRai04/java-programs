package Arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Extractelements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
           colors.add("Blue");
   colors.add("Green");
   colors.add("Red");
   colors.add("Yellow");
   colors.add("Black");
   

   List<String> subList = colors.subList(0, 2);
   

   System.out.println("Extracted elements: " + subList);
}
}



