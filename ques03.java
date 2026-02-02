// Given an integer array A of size n. In one sec u can increase the value of one element by one. Find the minimum time in secs to make all the elements of the array similar.
// Observation: To minimize the time , make all the elements equal to the maximum element in the array.
//              Time taken will be the sum of differences between max element and each element in the array.
// Pseudo Code: 1. Find the maximum element in the array.
//              2. Initialize time as 0.
//              3. For each element in the array, calculate the difference between max element and the element and add it to time.
//              4. Return time.
import java.util.Scanner;
public class ques03{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        for (int i=1; i<n; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int time =0;
        for (int i=0; i<n; i++){
            time += (max - arr[i]);
        }
        System.out.println("Minimum time to make all elements similar is: "+time+" secs");
    }
}