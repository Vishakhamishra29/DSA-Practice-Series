//Given an array of integers, find the smallest and the largest element in the array.

// Input: arr = [10, 5, 20, 8, 1]
// Output: 
// Minimum element = 1
// Maximum element = 20

// Q1: Find Minimum and Maximum Element in an Array
// Date: 5 Nov 2025
// Author: Vishakha Mishra

import java.util.Scanner;

public class Find_Max_Min {
    public static void main(String[] args) {
        int arr[]={10,33,22,44,55,66};
        int n=arr.length;
        // Scanner sc = new Scanner(System.in);

        // Input array size
        // System.out.print("Enter number of elements: ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // System.out.println("Enter array elements: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // Initialize min and max
        int min = arr[0];
        int max = arr[0];

        // Find min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Output result
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        // sc.close();
    }
}
