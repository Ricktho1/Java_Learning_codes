import java.util.*;

public class Problem_1 {
    public static float average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of " + a +","+b+","+c+" is "+ average(a,b,c));
        sc.close();
    }
}
