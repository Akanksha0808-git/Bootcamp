import java.util.*;
public class DeleteSmallest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int small=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]< arr[small])
            {
                small =i;
            }
         }
        for(int i =0;i<n;i++){
            if(i!= small){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
