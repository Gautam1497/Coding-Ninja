/*
Print Like a Wave

For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, i.e, print the first column top to bottom, next column bottom to top and so on.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the sine wave order in a single line, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
3 4
1  2  3  4
5  6  7  8
9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4
Sample Input 2:
2
5 3
1 2 3
4 5 6
7 8 9
10 11 12
13 14 15
3 3
10 20 30
40 50 60
70 80 90
Sample Output 2:
1 4 7 10 13 14 11 8 5 2 3 6 9 12 15
10 40 70 80 50 20 30 60 90
 */

import java.util.*;

public class AS12Q02_PLA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of test cases: ");
        int t=sc.nextInt();
        while (t-->0)
        {
            System.out.print("Enter value of rows and column: ");
            int rows=sc.nextInt();
            int col=sc.nextInt();
            int[][] arr=new int [rows][col]; //Array declaration
            for (int i=0;i<rows;i++)
            {
                for (int j=0;j<col;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            Wave(arr,rows,col);//call function Wave and give value of array arr
        }
    }
    public static void Wave(int [][] arr,int rows,int col) {
        int a=0;
        for (int i = 0; i < col; i++) {
            if (a==0){
                for (int j = 0; j <rows ; j++) {
                    System.out.print(arr[j][i]+" ");
                    if(j==rows-1)a=rows-1;
                }
            }
            else if (a==rows-1){
                for (int j = a; j >=0 ; j--) {
                    System.out.print(arr[j][i]+" ");
                    if(j==0)a=0;
                }
            }
        }
    }
}
