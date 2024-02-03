import java.util.*;
public class Checks_even {
    public static boolean isEven(int a){
        if(a%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println(n+ " is even number");
        }
        else{
            System.out.println(n+ " is odd number");
        }
        sc.close();
    }
}
