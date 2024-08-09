import java.util.Scanner;

public class sheet10{
    public static void main(String ar[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("--------- Matrix -----------");
        System.out.print("Enter Length of Row : ");
        int row = scan.nextInt();
        System.out.print("Enter Length of Column : ");
        int column = scan.nextInt();
        int Matrix[][]=new int[row][column];
        System.out.println("Enter Matrix Values :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                Matrix[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(" "+Matrix[i][j]);
            }
            System.out.println("");
        }
        
        scan.close();
    }
}
