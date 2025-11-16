//Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays.
// The elements in the union must be in ascending order.
public class Union_twoArray {
    public static void UnionofTwoArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0, j = 0;
    while (i < n1 && j < n2) {
    if (nums1[i] < nums2[j]) {
        System.out.print(nums1[i++] + " ");
    } else if (nums1[i] > nums2[j]) {
        System.out.print(nums2[j++] + " ");
    } else {
        System.out.print(nums1[i] + " ");
        i++;
        j++;
    }
}
    while (i < n1) {
            System.out.print(nums1[i++] + " ");
        }

        while (j < n2) {
            System.out.print(nums2[j++] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 6};
        int[] nums2 = {2, 3, 5, 7};
        System.out.print("Merged Array: ");
        UnionofTwoArrays(nums1, nums2);
    }
}

