import java.util.Scanner;

public class colSum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] matrix = new int[n][n];
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    int sum=0;
    for (int j=0; j<n; j++){
        for (int i=0;i<n; i++){
            sum+=matrix[i][j];
        }
        System.out.println("Sum of column " + j + " is: " + sum);
        sum=0;
    }
}
}

