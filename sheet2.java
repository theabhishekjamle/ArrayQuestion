import java.util.Scanner;
public class sheet2 {
    public static void main(String ar[]){
        System.out.print(" Enter The Length of Array : ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int array[]=new int[n];
        int Sum=0;
        System.out.print("Enter Values of Array : ");
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        for(int a : array){
            Sum=Sum+a;
        }
        System.out.println("Sum of All Elements in Array : "+ Sum);
        scan.close();
    }
}
