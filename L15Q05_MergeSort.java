/*
Merge Sort Code

Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
2 1 5 2 3
Sample Output 2 :
1 2 2 3 5
 */

import java.util.*;

public class L15Q05_MergeSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int [a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,a-1);
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergesort(int[] arr,int SI,int EI){
        if(SI>=EI)return;
        mergesort(arr,SI,(SI+EI)/2);
        mergesort(arr,(SI+EI)/2+1,EI);
        merge(arr,SI,EI);
    }

    private static void merge(int[] arr,int SI,int EI){
        int[] ans=new int [EI-SI+1];
        int i=SI;
        int mid=(SI+EI)/2;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=EI){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];
                i++;
            }
            else {
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<=EI){
            ans[k]=arr[j];
            j++;
            k++;
        }
        for(int z=0;z<ans.length;z++)
        {
            arr[SI+z]=ans[z];
        }
    }
}