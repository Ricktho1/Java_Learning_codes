import java.util.*;
public class Problem3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        System.out.println("Length of string: "+str+ " :is "+Length(str));
        sc.close();
    }
    public static int Length(String strin)
    {
        if(strin.length()==0){
            return 0;
        }
        return Length(strin.substring(1))+1;
    }
}
