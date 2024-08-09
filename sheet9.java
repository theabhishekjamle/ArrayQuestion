
import java.util.Arrays;
import java.util.Scanner;

public class sheet9 {
    public static void main(String ar[]){
        System.out.println("Enter Length OF Array : ");
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter kth Smallest OF Array : ");
        int k = scan.nextInt();
        int array[]=new int[n];
        System.out.print("Enter Elements  OF Array : ");
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        Arrays.sort(array);
        for(int a:array)
        System.out.print(a+" ");
        System.out.print("Kth Largest  : "+ array[n-k]);
        scan.close();
    }
}
