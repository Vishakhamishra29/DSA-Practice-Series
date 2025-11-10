import java.util.Arrays;
public class Multidimensional {
   //MultiDimensional Array
    public static void main (String args[]){
    int[][] arr={
        {1,2,3},
        {5,6},
        {9,10,11,12}
    };
    //Find the largest number in the multidimensional array
    int largest=arr[0][0];
  
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
     if(arr[i][j]>largest){
        largest=arr[i][j];
     }
   
       
    }}
    System.out.println("The largest is : " + largest);
   
}
}