package StringFolder;
import java.util.*;
public class ReplaceStringWithStar {
    public static void main(String agrs[]){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String pattern=sc.nextLine();
        String replace=sc.nextLine();
        for(int i=0;i<str.length();i++){
          boolean match=true;
          if (i <= str.length() - pattern.length()) {

                for (int j = 0; j < pattern.length(); j++) {
                    if (str.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    System.out.print(replace);
                    i = i + pattern.length();
                } else {
                    System.out.print(str.charAt(i));
                    i++;
                }

            } else {
                System.out.print(str.charAt(i));
                i++;
            }
 
        }
    }
}
