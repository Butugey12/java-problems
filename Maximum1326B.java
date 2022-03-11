import java.util.Scanner;
//problem 14
import static java.lang.System.out;

public class Maximum1326B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arrlen = input.nextInt();
        int[] array = new int[arrlen];
        for(int i=0;i<arrlen;i++)
            array[i]=input.nextInt();
        int x =0;
        //int[] a = new int[array.length];
        for(int i=0;i<array.length;i++){
            int ai= array[i]+x;
            out.print(ai+" ");
            x = Math.max(x,ai);
        }
    }

    private static void printArray(int[] array) {
        for (int elem : array) {
            out.print(elem + " ");
        }
        out.print("\n");
    }


}

