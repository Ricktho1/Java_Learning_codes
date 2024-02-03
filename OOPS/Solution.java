import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part of first and second number");
        int real1=sc.nextInt();
        int real2=sc.nextInt();
        System.out.println("Enter the imaginary part of first and second number");
        int img1=sc.nextInt();
        int img2=sc.nextInt();
        Complex a= new Complex(real1,img1);
        Complex b= new Complex(real2,img2);
        Complex s1=Complex.add(a,b);
        Complex s2=Complex.difference(a,b);
        Complex s3=Complex.product(a,b);
        s1.printComplex();
        s2.printComplex();
        s3.printComplex();
        sc.close();
    }
}   
class Complex{
    int r,i;
    public Complex(int real,int img)
    {
        r=real;
        i=img;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.r+b.r),(a.i+b.i));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.r*b.r)-(a.i-b.i)),((a.r*b.i)+(a.i*b.r)));
    }
    public static Complex difference(Complex a, Complex b){
        return new Complex((a.r-b.r),(a.i-b.i));
    }
    public void printComplex(){
        if(r==0&&i!=0)
        {
            System.out.println(i+"i");
        }
        else if(r!=0&&i==0)
        {
            System.out.println(r);
        }
        else
        {
            System.out.println(r+"+"+i+"i");
        }
    }
}