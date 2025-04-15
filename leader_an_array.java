package array;
import java.util.*;
public class leader_an_array {
    static void leaderofarray(int arr[],int n ){
        int current = arr[n-1];
        for (int i = n-2;i>=0;i++){
            if(current <arr[i]){
                current =  arr[i];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(arr);
        }      
}}
