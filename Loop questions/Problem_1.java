import java.util.*;
public class Problem_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int evensum=0,oddsum=0;
        do{
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if(a%2==0){
                evensum+=a;
            }
            else{
                oddsum+=a;
            }
            System.out.println("To continue press 1 else press 0");
            int b = sc.nextInt();
            if(b==1)
            {
                continue;
            }
            else
            {
                System.out.println("Sum of even numbers="+evensum);
                System.out.println("Sum of odd numbers="+oddsum);
                break;
            }
        }while(true);
        sc.close(); 
    }
}