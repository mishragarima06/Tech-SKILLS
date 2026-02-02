// Given an integer array A. Find and return the product array of the same size where the ith element of thr product array is equal to the product of all the elements divided by ith elemnt of the array A. 
// eg. [1,2,3,4] => [24,12,8,6]
// Observation: The product of all elements can be calculated first. Then for each element in the array, divide the total product by that element to get the corresponding element in the product array.
import java.util.Scanner;
public class ques04{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int totalProduct =1;
        for (int i=0; i<n; i++){
            totalProduct*=arr[i];
        }
        int[] productArr = new int[n];
        for (int i=0; i<n; i++){
            productArr[i] = totalProduct / arr[i];
        }
        System.out.println("Product array is: ");
        for (int i=0; i<n; i++){
            System.out.print(productArr[i] + " ");
        }
    }
} 