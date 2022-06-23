package Shorting;
import java.util.*;
class Point
{
    int x, y;
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
class MyCmp implements Comparator<Point>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point p1, Point p2)
    {
        return p1.x - p2.x;
    }
}
public class Example9 {
    public static void main(String[] args) {
         // Create a list of Integers 
         List<Point> list = new ArrayList<Point>(); 
         list.add(new Point(5, 10)); 
         list.add(new Point(2, 20));  
         list.add(new Point(10, 30)); 
         
         // List is sorted in natural order
         // Passing the list and MyCmp object
         Collections.sort(list, new MyCmp());
         
         // Displaying the points
         for (Point p: list)
             System.out.println(p.x + " " + p.y);  
    }
}
