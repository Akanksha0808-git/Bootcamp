import java.util.Scanner;

public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int row,col;
      int sum,maxSum=0,index=0;

      System.out.println("Enter no. of Rows");
      row=sc.nextInt();
      System.out.println("Enter no. of Columns");
      col=sc.nextInt();

      int[][]mat=new int[row][col];

      System.out.println("Enter matrix Elements");
      for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            mat[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<row;i++){
        sum=0;
        for(int j=0;j<col;j++){
             sum+=mat[i][j];
        }
        System.out.println("Sum of row"+(i+1)+"="+sum);

        if(sum>maxSum){
          maxSum=sum;
          index=i;
        }
    }
System.out.println("After deletion max row the matrix will be");
    for(int i=0;i<row;i++){
        if(i==index){
            continue;
        }
        for(int j=0;j<col;j++){
             System.out.print(mat[i][j]+" ");
        }
    System.out.println();
}

    }
}