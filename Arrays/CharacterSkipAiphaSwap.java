import java.util.*;
public class CharacterSkipAiphaSwap {
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the no of characters:");
      
      int n=sc.nextInt();
    sc.nextLine(); 
      String[] arr=new String[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextLine();
      }
      
      for(int c=0;c<n;c++){
        char[] ch=arr[c].toCharArray();
for(int i = 0, j = ch.length - 1; i < j;)          {
           if(!Character.isLetter(ch[i])){
             i++;
           }
           else if(!Character.isLetter(ch[j])){
             j--;
           }
            else{
                char temp= ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;

            }
        }
        System.out.println("-1");
      }
sc.close();
    }
}
