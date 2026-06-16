import java.util.*;
public class DeleteSmallest {
    public static void mai(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i =0;i>n;i++){
          arr[n]=sc.nextInt();
        }
        double small;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            else{
                if(small<arr[i]){
                    small=arr[i];
                    arr.remove(small);
                }
            }
        }
        
return small;
    }
}
