import java.util.*;
public class decimal_binary_conversion{
    public static int binary_decimal(int bn){
        int pow=0,dec=0;
        while(bn>0){
            int last_digit=bn%10;
            dec=dec+(last_digit*(int)(Math.pow(2,pow)));
            bn=bn/10;
            pow++;
        }
        return dec;
    }
    public static int decimal_binary(int dec){
        int pow=0,bn=0;
        while(dec>0){
            int rem=dec%2;
            bn=bn+(rem*(int)(Math.pow(10,pow)));
            dec=dec/2;
            pow++;
        }
        return bn;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a decimal number to convert to binary");
        int dec = sc.nextInt();
        System.out.println("Enter a binary number to convert to decimal");
        int bn = sc.nextInt();
        System.out.println("The binary number of "+dec+" is "+ decimal_binary(dec));
        System.out.println("The decimal number of "+bn+" is "+ binary_decimal(bn));
        sc.close();
    }
}