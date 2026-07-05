package StringFolder;
import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();

        int left=0;
        int right =str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(str.charAt(right)!=str.charAt(left)){
               isPalindrome=false;
               break;
            }
             left++;
            right--;
        }
         if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
        
    }
}
