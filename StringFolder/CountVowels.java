package StringFolder;
import java.util.*;
public class CountVowels {
   public static void main(String agrs[]){
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    str= str.toLowerCase();
    int vowels=0;
    int consonant=0;
    for(int i=0;i<str.length();i++){
     char ch=str.charAt(i);
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
vowels++;
     }   
     else if(Character.isLetter(ch)){
        consonant++;
     }
    }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonant);

    sc.close();
   } 
}
