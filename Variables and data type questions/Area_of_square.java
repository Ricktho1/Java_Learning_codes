import java.util.*;
//area of square
public class Area_of_square {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a side");
        int a = sc.nextInt();
        System.out.println("Area of square is "+ (a*a));
        sc.close();
    }
    
}
