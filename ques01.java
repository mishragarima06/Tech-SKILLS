// GIVEN AN ARRAY . COUNT NUMBER OF ELEMENTS HAVING ATLEAST ONE ELEMENT GREATER THAN ITSELF.
// Eg. [-3,2,6,8,4,8,5] => 5 (All except 8)
// Observation: Number of elements having at least one element greater than itself = Total number of elements - Number of maximum elements.
//              So we just need to find the count of maximum elements in the array.
// Pseudo Code:
// 1. Iterate and find the maximum element in the array.
// 2. Iterate again and get the elements that are not equal to maximu element.
// 3. Increment the count for each such element.

import java.util.Scanner;
public class ques01{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int maxCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                maxCount++;
            }
        }
        int count = n - maxCount;
        System.out.println("Number of elements having at least one element greater than itself: ");
        System.out.println(count);
    }
}