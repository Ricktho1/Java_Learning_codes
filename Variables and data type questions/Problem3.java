import java.util.*;
public class Problem3 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter cost of 3 items");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float bill = (1.18f*a)+(1.18f*b)+(1.18f*c);
        System.out.println("Bill is"+ bill);
        sc.close();
    }    
}
