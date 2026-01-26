// Given an Array of integer num. Calculate the pivote index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index
// is equal to the sum of all the numbers strictly to the right of the index.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
// This also applies to the right edge of the array.
// If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
// eg . [1,7,3,6,5,6] => 3
// Observation: At pivot index, leftSum = rightSum
//           leftSum = totalSum - leftSum - arr[i]
// Psuedo Code:
// 1. Calculate the total sum of the array.
// 2. Initialise leftSum as 0.
// 3. Iterate trough the array and for each element at index i:
// 4. Calculate rightSum = totalSum - leftSum - arr[i]
// 5. If leftSum equals rightSum, return i.
// 6. Increment the leftsum.

import java.util.Scanner;
public class ques02{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int totalSum =0;
        for (int i=0; i<n; i++){
            totalSum+=arr[i];
        }
        int leftSum =0;
        for (int i=0; i<n; i++){
            int rightSum = totalSum - leftSum -arr[i];
            if (leftSum == rightSum){
                System.out.println("Pivot index is: ");
                System.out.println(i);
                return;
            }
            leftSum+=arr[i];
        }
    }
}