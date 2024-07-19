/*
Binary Search (Recursive)

Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8
5
Sample Output:
3
 */

import java.util.*;

public class AS17Q03_Binary_Search_Recursive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] ar=new int[a];
        for (int i=0;i<a;i++){
            ar[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(check(x,ar,0,a-1));
    }
    public static int check(int x,int[] ar,int l,int h){
        if(l>h)return -1;
        int m=l+(h-l)/2;
        if(ar[m]==x)return m;
        if(ar[m]>x)return check(x,ar,l,m-1);
        else return check(x,ar,m+1,h);
    }
}