import java.util.*;
public class Problem1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a text");
        String str;
        str=sc.nextLine();
        int count=0;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u')
                count++;
        }
        System.out.println("Number of vowels is "+count);
        sc.close();
    }
}