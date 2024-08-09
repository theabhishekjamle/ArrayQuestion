import java.util.ArrayList;
import java.util.Scanner;

public class sheet1{
    public static void main(String ar[]){
        // System.out.print("Enter Lenght of Array : ");
        // int n=scan.nextInt();
        // System.out.print("Enter Any Values : ");
        // int array1[]=new int[n];
        // for(int i=0;i<n;i++){
            //     // array.add(scan.nextInt());
            //     array1[i]=scan.nextInt();
            // }
            // for(int i=0;i<n;i++){
                //     System.out.print(" "+array1[i]);
                // }
        System.out.print("Enter Values :  ");        
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array=new ArrayList<>();
        while (scan.hasNextInt()) {
            array.add(scan.nextInt());
        }
        for(int a : array){
           System.out.println(a);
        }
        scan.close();

    }
}