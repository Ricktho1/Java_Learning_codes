import java.util.*;
public class Problem3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 string");
        String str1= sc.nextLine();
        String str2= sc.nextLine();
        if(str1.length()==str2.length()){
            int c=0;
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        c++;
                    }
                }
            }
            if(c==str1.length())
                System.out.println("Anagrams");
            else
                System.out.println("Not anagrams");
        }    
        else{
            System.out.println("Not anagrams");
        }
        sc.close();
    }
}

