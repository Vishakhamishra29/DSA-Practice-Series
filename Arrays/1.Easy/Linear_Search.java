public class Linera_Search {
    
    public  static int findIndex(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1; 
    }
 

    public static void main(String[] args) {
       int[] nums = {4, 2, 7, 2, 9};
        int target = 5;
        System.out.println(findIndex(nums, target));
    }
}


