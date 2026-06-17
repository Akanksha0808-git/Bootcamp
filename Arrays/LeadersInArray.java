import java.util.*;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxRight = arr[n - 1];

        System.out.print("Leaders: ");
        System.out.print(maxRight + " ");

        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
