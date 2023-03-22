package company.com;
import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    static int minDif(int []arr, int n, int m){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff = arr[i+m-1]-arr[i];
            if(diff<min){
                min=diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = new int[8];
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = A.nextInt();
        }
        int n = arr.length;
        int m = 5;
        System.out.println(minDif(arr,n,m));
    }
}