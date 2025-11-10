// Q2: Find the second largest element in the array
public class Find_Sec_Largest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};

        // Edge case: array must have at least two elements
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        // Step 1: Find the largest element
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Step 2: Find the second largest element
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        // Step 3: Print results
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all elements may be equal)");
        } else {
           
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}

