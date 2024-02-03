import java.util.*;
public class Search_question1{
    public static int frequency(int matrix[][],int key){
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrix:");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("Enter "+(i*j)+" elements ");
        int matrix[][]=new int[i][j];
        for(int a=0;a<i;a++){
            for(int b=0;b<j;b++){
                matrix[a][b]=sc.nextInt();
            }
        }
        System.out.println("Frequency of 7 in the matrix is "+frequency(matrix,7));
        sc.close();
    }
}