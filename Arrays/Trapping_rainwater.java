import java.util.*;
public class Trapping_rainwater {
    public static int trapped_water(int height[]){
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i = 1;i<height.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i++)
        {
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int trappedwater=0;
        for(int i =0;i<height.length;i++)
        {
            int waterlevel = Math.min(rightmax[i],leftmax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 heights");
        int height[]=new int[5];
        for(int i = 0;i<5;i++)
        {
            height[i]=sc.nextInt();
        }
        System.out.println("Trapped rainwater is "+ trapped_water(height) );
        sc.close();
    }
}
