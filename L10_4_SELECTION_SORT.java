// Code SELECTION SORT

import java.util.Scanner;

public class L10_4_SELECTION_SORT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element of array: ");
        int t=sc.nextInt();
        System.out.print("Enter elements of array: ");
        int[] arr=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        sort(arr);
        for (int i=0;i<t;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int []arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j]) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
