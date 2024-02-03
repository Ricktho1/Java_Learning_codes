import java.util.*;
public class Program3 {
    public static int stocks(int price[]){
        int buyprice=price[0];
        int profit=0;
        for(int i =0;i<price.length;i++)
        {
            if(buyprice<price[i]){
                profit=Math.max(price[i]-buyprice,profit);
            }
            else
            {
                buyprice=price[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int price[]= new int[6];
        System.out.println("Enter 5 numbers");
        for(int i = 0;i<6;i++){
            price[i]=sc.nextInt();
        }
        System.out.println("Your profit is "+stocks(price));
        sc.close();
    }
}
