public class Find_Sec_Largest {
   public static int secondLargestElement(int[] nums) {
        int largest=nums[0];
    for(int i=1;i<nums.length;i++){
  if(nums[i]>largest){
   largest=nums[i];
  }}
  int secondLargest=Integer.MIN_VALUE;
  for(int i=0;i<nums.length;i++){
    if(nums[i]>secondLargest && nums[i]!=largest){
        secondLargest=nums[i];
    }
  }
  if(secondLargest==Integer.MIN_VALUE)
    return -1;
  else
   return secondLargest;
   }
    public static void main (String args[]){
        int nums[]={8,10,7,9};
        System.out.println(secondLargestElement(nums));
    }

    }


