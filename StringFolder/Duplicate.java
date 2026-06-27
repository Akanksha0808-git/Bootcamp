package StringFolder;
import java.util.*;

public class Duplicate {
   public static void main(String agrs[]){
    Scanner sc = new Scanner(System.in);
    String str= sc.nextLine();

    for(int i =0;i<str.length();i++){
            boolean duplicate=false;
        for(int j=0;j<i;j++){
            if(str.charAt(i)==str.charAt(j)){
                duplicate=true;
                break;
            }
        }
        if(!duplicate){
            System.out.print(str.charAt(i));
        }
    }
    sc.close();

   } 
}
