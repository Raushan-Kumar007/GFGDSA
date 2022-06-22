package mathematic.Problems;

import java.util.ArrayList;

public class QuadraticEquationRoots {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
          ArrayList<Integer> al = new ArrayList<>();
           double d = (b*b)-(4*a*c);
           if(d<0)
               al.add(-1);
           else{
        double dis = Math.sqrt(d);
        double r1 = (-b + dis)/(2*a);
        double r2 = (-b - dis)/(2*a);
          al.add((int)Math.floor(Math.max(r1,r2)));
          al.add((int)Math.floor(Math.min(r1,r2)));
           }
           return al;
}
}
