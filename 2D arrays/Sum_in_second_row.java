import java.util.*;
public class Sum_in_second_row {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dimensions of the matrix");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("Enter "+(i*j)+" elements");
        int matrix[][]=new int[i][j];
        for(int a=0;a<i;a++){
            for(int b=0;b<j;b++){
                matrix[a][b]=sc.nextInt();
            }
        }
        int sum=0;
        for(int a=0;a<j;a++){
            sum+=matrix[1][a];
        }
        System.out.println("Sum of 1st row is "+sum);
        sc.close();
    }
}
