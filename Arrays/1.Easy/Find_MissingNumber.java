// Given an integer array of size n containing distinct values in the range from 0 to n (inclusive),
//  return the only number missing from the array within this range.

public class Find_MissingNumber {
   public static void findMissing_number(int[] arr){
        int n=arr.length;
        int Array_sum=0;
         int total_sum=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
           Array_sum+=arr[i];
          }
       
       int missing_number=(total_sum - Array_sum);
        System.out.println(missing_number);
        }
    public static void main(String args[]){
        int arr[]={0, 1, 2, 4, 5, 6};
        findMissing_number(arr);
    }
}
