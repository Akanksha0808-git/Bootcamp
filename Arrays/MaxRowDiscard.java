import java.util.*;
public class MaxRowDiscard {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int [][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        int maxSum = 0;
        int maxRow =0;

        for(int i = 0; i < row; i++) {
            int sum = 0;

            for(int j = 0; j < col; j++) {
                sum += mat[i][j];
            }

            if(sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Maximum Sum Row = " + maxRow);

        System.out.println("Matrix after discarding the row:");

        for(int i = 0; i < row; i++) {
            if(i == maxRow)
                continue;

            for(int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

    }
    sc.close();
    }
}
