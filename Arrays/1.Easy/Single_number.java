// Given an array of nums of n integers. Every integer in the array appears twice except one integer.
//  Find the number that appeared once in the array.
import java.util.Arrays;
public class Single_number {
    public static int singleNumber(int [] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
       return arr[arr.length-1];
    }
    public static void main(String args[]){
        int [] arr={1,2,3,4,2,1,4};
        System.out.println(singleNumber(arr));
    }
}
