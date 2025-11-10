// Q2: Find the second largest element in the array
public class Find_Sec_Largest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};
       int largest=arr[0];
       for (int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
       }
       int secondLargest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
       if(arr[i]!=largest && arr[i]>secondLargest){
        secondLargest=arr[i];
       }
       }
       if(secondLargest==Integer.MIN_VALUE){
        System.out.println("No second largest");
       }else{
        System.out.println("The second largest is : " + secondLargest);
       }
    }
}

