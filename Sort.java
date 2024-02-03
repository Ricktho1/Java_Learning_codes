import java.util.*;
public class Sort {
    //O(n*n)
    public static void Bubble_Sort(int nums[]){
        for(int turns=0;turns<nums.length-1;turns++){
            //int swap=0;
            for(int j=0;j<nums.length-turns-1;j++){
                /*if(nums[j]>nums[j+1]){
                    swap++;
                }
                if(swap>0){
                    swap it
                }
                */
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
                /*if(swap==0)
                    break;
                */
            }
        }
    }
    //O(n*n)
    public static void Selection_Sort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minPos]>nums[j]){
                    minPos=j;
                }
            }
            int temp=nums[minPos];
            nums[minPos]=nums[i];
            nums[i]=temp;
        }
    }
    //O(n*n)
    public static void Insertion_sort(int nums[]){
        for(int i=1;i<nums.length-1;i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev>=0&&nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=nums[prev];
        }
    }
    //time complexity = O(nlogn)
    public static void Inbuilt_sort(Integer nums[]){
        Arrays.sort(nums);//ascending order from package Arrays
        //Array.sort(nums,0,3)//sorts array from index 0 to 2
        //Array.sort(nums,collections.reverseOrder())//in descending order from package collections
        //Array.sort(nums,0,3collections.reverseOrder())
    }
    //time complexity = O(n+range)
    public static void Count_Sort(int nums[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            largest=Math.max(largest,nums[i]);
        }
        int count[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                count[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int nums[]=new int[5];
        for(int i=0;i<5;i++){
            nums[i]=sc.nextInt();
        }
        Bubble_Sort(nums);
        System.out.println("The sorted array:");
        for(int i =0;i<5;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}
