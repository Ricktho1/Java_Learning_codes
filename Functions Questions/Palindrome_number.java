import java.util.*;
public class Palindrome_number {
public static void Palindrome (int a){
    int ld;
    int n=a;
    int sum=0;
    while(a>0){
        ld=a%10;
        sum=(sum*10)+ld;
        a=a/10;
    }
    if(sum==n){
        System.out.println("Palindrome number");
    }
    else{
        System.out.println("Not palindrome number");
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    Palindrome(a);
    sc.close();
}
}
