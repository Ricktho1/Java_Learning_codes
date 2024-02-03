import java.util.*;
public class Problem4 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str=sc.nextLine();  
        System.out.println("Number of such substrings are :"+Sub_strinf(str,0,str.length()-1,str.length()));
        sc.close();
    }
    public static int Sub_strinf(String str,int f,int l,int n)
    {
        if (n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int res=Sub_strinf(str,f+1,l,n-1)+Sub_strinf(str,f,l-1,n-1)-Sub_strinf(str,f+1,l-1,n-2);
        if(str.charAt(f)==str.charAt(l))
        {
            res++;
        }
        return res;
    }
}
