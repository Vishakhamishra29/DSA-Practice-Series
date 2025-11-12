public class Rotate_ArrayByKplace {
public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 

        for (int i = 0; i < k; i++) {
            int temp = nums[0]; 
            for (int j = 0; j < n - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[n - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,6,7};
        int k = 3;

        rotateLeft(nums, k);

        System.out.print("Rotated Array: ");
        for (int i=0;i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }
}



