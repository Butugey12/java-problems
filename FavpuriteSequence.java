import java.util.Scanner;
import static java.lang.System.out;
//
public class FavpuriteSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-->0){
            int arrlen=  input.nextInt();
            int[] arr = new int[arrlen];
            for(int i=0;i<arrlen;i++){
                arr[i]= input.nextInt();
            }
            int[] b = new int[arr.length];
            int n =b.length-1;
            int k=0;
            for(int i=0;i<b.length;i++){
                if(i%2==0){
                    out.print(arr[k]+" ");
                    //b[k]= arr[k];
                    //continue;
                }
                else {
                    //int k=0;
                    out.print(arr[n-k]+" ");
                    //b[n-k]=arr[n-k];
                    k++;
                }

            }
        }




        out.println();
        //printArray(b);

    }
    private static void printArray(int[] array) {
        for (int elem:array) {
            out.print(elem +" ");
        }
        out.print("\n");
    }
}
