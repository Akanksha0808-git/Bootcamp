import java.util.*;
public class SortColor{
    public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
   int n= sc.nextInt();
   int [] nums=new int[n];
   for(int i =0;i<n;i++){
    nums[i]=sc.nextInt();
}
int mid=0, low=0, hi=nums.length-1;
     while(mid<=hi){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
            low++;
            mid++;
          
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[hi];
                nums[hi]=temp;
                hi--;
            }
        }
       System.out.println(Arrays.toString(nums));
       sc.close();
    }
 }

