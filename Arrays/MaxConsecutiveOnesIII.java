import java.util.*;

public class MaxConsecutiveOnesIII {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    int left=0;
       int ZeroCount=0;
       int max=0;
       for(int i=0;i<n;i++){
        if(nums[i]==0){
            ZeroCount++;
        }
        while(ZeroCount >k){
            if(nums[left]==0){
                ZeroCount--;
            
            }
                left++;
        }
        max = Math.max(max, i - left + 1);
       }
      System.out.println(max);
      sc.close();
 }   
}
