/*Check triangle

        You are given the lengths of 3 sides of a valid triangle. You need to print any one of the following outputs depending on the triangle's nature.
        Print 1, if the triangle is equilateral
        Print 0, if it's isosceles
        Print -1, if it's scalene*/

import java.util.*;

public class AS1Q1_CT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of all 3 sides");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b & b==c) System.out.println("Equilateral Triangle");
        else if(a == b & b != c || b == c & a != c || a == c)
            System.out.println("isosceles Triangle");
    }

}
