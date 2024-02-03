import java.util.*;
public class Sum{
    public static int digitsum(int n){
        int ld,sum=0;
        while(n>0){
            ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Sum of digits of "+a+" is "+ digitsum(a));
        sc.close();
    }
}
