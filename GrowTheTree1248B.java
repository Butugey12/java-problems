import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;
//problem15
public class GrowTheTree1248B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] array =new int[n];
        for(int i=0;i<n;i++){
            array[i]= input.nextInt();
        }
        Arrays.sort(array);
        //printArray(array);
        long vertical=0l;
        long horizontal=0l;
        for (int i = 0; i <n ; i++) {
            if(i<n/2){
                vertical+=array[i];
            }
            else {
                horizontal+=array[i];
            }
        }
        out.println(vertical*vertical+horizontal*horizontal);



    }
    private static void printArray(int[] array) {
        for (int elem : array) {
            out.print(elem + " ");
        }
        out.print("\n");
    }

}
