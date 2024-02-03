import java.util.*;
public class Problem5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disks for tower of hanoi problem");
        int n=sc.nextInt();
        Towerofhanoi(n, "S", "H", "D");
        sc.close();
    }
    public static void Towerofhanoi(int n, String src, String helper, String dest)

    {
        if(n==1){
            System.out.println("transfer disk "+n+" From "+src+" to "+dest);
            return;
        }
        Towerofhanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" From "+src+" to "+dest);
        Towerofhanoi(n-1, helper, src, dest);

    }
}
