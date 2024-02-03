import java.util.*;
public class Program1
{
    public static boolean arrays(int numbers[])
    {
        int c=0;
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if((i!=j)&&(numbers[i]==numbers[j]))
                {
                    c++;
                }
            }
        }
        if(c>=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 elements");
        int numbers[]=new int[5];
        for(int i=0;i<5;i++)
        {
            numbers[i]=sc.nextInt();
        }
        if(arrays(numbers)){
            System.out.println("Not Distinct");
        }
        else
        {
            System.out.println("Distinct");
        }
        sc.close();
    }
}