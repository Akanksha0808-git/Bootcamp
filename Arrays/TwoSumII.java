import java.util.*;
public class TwoSumII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[]numbers=new int[n];
    for(int i=0;i<n;i++){
        numbers[i]=sc.nextInt();
    }
        int target=sc.nextInt();
        int i=0;
        int j=n-1;
        boolean found=false;
      while(i<j){
            int result=numbers[i]+numbers[j];
            if(result==target){
System.out.println((i+1)+" "+(j+1));
found=true;
// return;
break;
            }
            else if(result<target){
             i++;
            }
            else{
                
                j--;
            }
      }
      if(!found){
          System.out.println("No solution found");

      }
        sc.close(); 
       

    }
}
// Sample Input
// 4
// 9
// 2 7 11 15
// Output
// 1 2