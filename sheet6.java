import java.util.Scanner;

public class sheet6 {
    public static void main(String ar[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Any Decimal Number : ");
        int Decimal = scan.nextInt();
        System.out.print("The Binary converstion of the Decimal Number : ");
        StringBuilder s= new StringBuilder();
        while (Decimal!=0) {   
            int r= Decimal%2;
            s.append(r);
            Decimal=Decimal/2;
        }
        System.out.println( s.reverse().toString());
        scan.close();
    }
}
