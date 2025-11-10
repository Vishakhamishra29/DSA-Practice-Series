import java.util.Arrays;
public class Remove_Duplicates {
    public static void main(String args[]){
    int [] arr={0,0,3,3,4,5,6,7,7};
    int count=1;
    for(int i=1;i<arr.length;i++){
        if(arr[i]!=arr[i-1]){
            count++;
        }
    }
    System.out.println(count);
    }
}
