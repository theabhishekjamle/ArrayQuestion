import java.util.Scanner;

public class sheet4 {
    public static void main(String arr[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = scan.nextInt();
        int array[]=new int[n];
        System.out.print("Enter Any Numbers  Array : ");
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        int largestNum=array[0];
        int smalestNum=array[0];
        for(int a : array){
            if(largestNum<a){
                largestNum=a;
            }
            else if(smalestNum>a){
                smalestNum=a;
            }
        }
        System.out.println("Largest Element in array : "+largestNum);
        System.out.println("Small Element in array : "+smalestNum);
        scan.close();
    }
}
