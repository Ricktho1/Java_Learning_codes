import java.util.*;
public class MaxSum_SubArray {
    public static void brute_force(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum is "+maxsum);
    }
    public static void prefix_sum(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate the prefix array
        for(int i =1;i<numbers.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currsum=0;
                currsum=start==0?currsum=prefix[end]:prefix[end]-prefix[start-1];
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum is "+maxsum);
    }
    public static void Kadanes_algorithm(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs = 0,c=0;
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]<0){
                c++;
            }
        }
        if(c!=numbers.length){
            for(int i=0;i<numbers.length;i++){
                cs=cs+numbers[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs, ms);
            }
        }
        else{
            for(int i =0;i<numbers.length;i++){
                if(numbers[i]<(cs+numbers[i])){
                    cs=cs+numbers[i];
                }
                else{
                    cs=numbers[i];
                }
                if(ms<cs){
                    ms=cs;
                }
            }
        }
        System.out.println("Max sum of subarray: "+ ms);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 elements");
        int numbers[] = new int[5];
        for(int i = 0;i<5;i++){
            numbers[i]=sc.nextInt();
        }
        //brute_force(numbers);
        //prefix_sum(numbers);
        Kadanes_algorithm(numbers);
        sc.close();
    }
}
