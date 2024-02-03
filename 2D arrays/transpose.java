import java.util.*;
public class transpose {
    public static void do_transport(int matrix[][]){
        int transpose[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.println(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
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
        sc.close();
    }
}
