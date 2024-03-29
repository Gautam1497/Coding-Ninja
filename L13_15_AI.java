/*
Array Intersection

You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first sorted array/list(ARR1).

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the first the array/list.

The third line contains an integer 'M' representing the size of the second array/list.

The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output format :
For each test case, print the intersection elements in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^6
0 <= M <= 10^6

Time Limit: 1 sec
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7
2
10 10
1
10
Sample Output 1 :
2 3 4
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
1 2 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.
 */

import java.util.*;

public class L13_15_AI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of testcases: ");
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.print("Enter no of element for arr: ");
            int n=sc.nextInt();
            int[] arr=new int [n]; //Array1 declaration
            for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter no of element for arr2: ");
            int m=sc.nextInt();
            int[] arr2=new int [m]; //Array2 declaration
            for (int i=0;i<m;i++)
            {
                arr2[i]=sc.nextInt();
            }
            Intersection(arr,arr2,n,m);//call function Intersection and give value of both array
        }
    }
    public static void Intersection(int [] arr,int [] arr2,int n,int m)
    {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int a=0;
        for (int i=0;i<n;i++)
        {
            for (int j=a;j<m;j++)
            {
                if(arr[i]==arr2[j])
                {
                    System.out.print(arr[i]+" ");
                    break;
                } else if(arr[i]<arr2[j]){
                    i++;
                    break;
                }
            }
        }
        System.out.println();
    }
}
