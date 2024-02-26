/*
Code Merge Two Sorted Arrays

You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90
 */

import java.util.Scanner;

public class L10_12_MERGE_SORT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int a=sc.nextInt();
        while (a-->0){
            System.out.print("Enter number of element of array 1: ");
            int t = sc.nextInt();
            System.out.print("Enter elements of array 1: ");
            int[] arr = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter number of element of array 2: ");
            int t2 = sc.nextInt();
            System.out.print("Enter elements of array 2: ");
            int[] arr2 = new int[t2];
            for (int i = 0; i < t2; i++) {
                arr2[i] = sc.nextInt();
            }
            int [] ans=merge(arr,arr2);
            for (int an : ans) {
                System.out.print(an + " ");
            }
            System.out.println();
        }
    }
    public static int[] merge(int []arr,int []arr2)
    {
        int l=arr.length+arr2.length;
        int [] ans=new int[l];
        int a=0;
        int b=0;
        int i=0;
        while (a<arr.length && b<arr2.length)
        {
            if(arr[a]<arr2[b])
            {
                ans[i]=arr[a];
                a++;
            }
            else {
                ans[i]=arr2[b];
                b++;
            }
            i++;
        }
        while (a<arr.length){
            ans[i] = arr[a];
            a++;
            i++;
        }
        while (b<arr2.length){
            ans[i]=arr2[b];
            b++;
            i++;
        }
        return ans;
    }
}