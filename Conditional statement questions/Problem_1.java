import java.util.*;
public class Problem_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a>=0)
        {
            System.out.print("Positive");
        }
        else{
            System.out.println("Negative");
        }
        sc.close();
    }
}