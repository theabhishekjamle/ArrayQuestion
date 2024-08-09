import java.util.Scanner;

public class sheet3 {
   public static void main(String ar[]){
    System.out.print("Enter length of array : ");
    Scanner scan= new Scanner(System.in);
    int n= scan.nextInt();
    int array[]=new int[n];
    int even=0;
    int odd=0;
    System.out.print("Enter Values of array : ");
    for(int i=0;i<n;i++){
        array[i]=scan.nextInt();
    } 
    for(int a : array){
        if(a%2==1)odd++;
        else even++;
    }
    System.out.println("Total Even Numbers : "+even);
    System.out.println("Total odd Numbers : "+odd);
    scan.close();
}
}
