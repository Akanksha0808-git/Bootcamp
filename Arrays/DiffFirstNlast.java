import java.util.Scanner;
public class DiffFirstNlast {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []arr= new int[100];
        System.out.println("Enter the number of elemnets in the array");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        }
        int diff=arr[0]-arr[n-1];
        System.out.println("The difference is "+diff);
        sc.close();

    }
}
