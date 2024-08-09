import java.util.Scanner;

public class sheet5 {
    public static void main(String ar[]){
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = scan.nextInt();
        int array[]=new int[n];
        System.out.print("Enter Any Numbers of Array : ");
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        reverse(array);
        scan.close();
    }
    public static void reverse(int array[]){
        
        int end=array.length-1;
        
        for(int i=0,j=end;i<j;i++,j--)
        {
            int temp = array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        for(int a : array){
            System.out.print(" "+a);
        }
       
    }
}
