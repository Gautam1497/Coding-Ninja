/*
First Index of Number

Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
Constraints :
1 <= N <= 10^3
Sample Input :
4
9 8 10 8
8
Sample Output :
1
 */

import java.util.Scanner;

public class L14Q016_FIN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); // Size of array
        int[] arr=new int [n]; // Declare Array
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); // Take input of array
        }
        int a=sc.nextInt(); // Number to check
        System.out.println(check(arr,a,0)); // Call function with input of arr, no to check, and starting index 0
    }
    public static int check(int[] arr,int a,int n){
        if(n== arr.length)return -1;
        if(arr[n]==a)return n;
        return check(arr,a, n+1);
    }
}