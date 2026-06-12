import java.util.*;
public class SubarraySumIndices {
    public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int target=sc.nextInt();

int[] arr= new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
    int sum=0;
    for(int j=i;j<n;j++){
        sum=sum+arr[j];
        if(sum==target){
            System.out.println((i+1)+" "+(j+1));
            return;
        }
    }   
}
System.out.println("-1");
sc.close();
}
}
