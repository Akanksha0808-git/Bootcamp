package StringFolder;

import java.util.*;
public class Reverse{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char[] arr= str.toCharArray();
int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
String reversed = new String(arr);
System.out.println("Reversed String :"+reversed);
sc.close();
    }
}