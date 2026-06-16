//6. Sum of array (range given) 
import java.util.*;
public class SumArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int strt=sc.nextInt();
        int end=sc.nextInt();
        for(int i=strt;i<end;i++){
             sum+=arr[i];
        }
        System.out.println("Sum ="+ sum);
        sc.close();
    }
}
