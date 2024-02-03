import java.util.*;
class Problem1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int n= sc.nextInt();
        System.out.println("Enter "+n+" numbers");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        findkey(arr,n,0);
        sc.close();
    }
    public static void findkey(int arr[],int n,int i)
    {
        if(i==arr.length)
        {
            return;
        }
        if(arr[i]==n)
        {
            System.out.println(i+" ");
        }
        else{
            findkey(arr,n,i+1);
        }
    }
}