package Shorting;

import java.util.*;
 

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(10); 
        list.add(5); 
        list.add(20); 
        
        // List is sorted in the natural order
        Collections.sort(list);
        
        // Displaying the sorted list
        System.out.println(list);
        
        // Sorting the list in reverse order
        Collections.sort(list, Collections.reverseOrder()); 

        // Let us print the sorted list 
        System.out.println(list); 
    }
}
