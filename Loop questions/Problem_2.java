import java.util.*;
public class Problem_2 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            int i, factorial=1;
            for(i=1;i<=a;i++)
            {
                factorial*=i;
            }
            System.out.println("Factorial of "+a+" is "+factorial);
            sc.close();
        }
    }
}
