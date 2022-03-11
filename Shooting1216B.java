import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Shooting1216B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Integer[] durability= new Integer[n];
        int[] anotherOne= new int[n];
        int[] position=new int[n];
        //int[] anotherP= new int[n];
        for(int i=0;i<n;i++){
            durability[i]= input.nextInt();
            anotherOne[i]=durability[i];//{20,10,20}
            position[i]=i+1;

        }

        Arrays.sort(durability,Collections.reverseOrder());//{20,20,10}
        long min = 0L;
        for(int i=0;i<n;i++){
            min += (durability[i]*i)+1;
        }
        for(int i=0;i<n;i++){      //{5,5,5,4,4,4}-->durability
            for(int j=0;j<n;j++){//{5,4,5,4,4,5}-->anotherOne
                if(durability[i]==anotherOne[j]&& durability[i]!=-1 && anotherOne[j]!=-1){
                    position[i]=j+1;
                    durability[i]=-1;
                    anotherOne[i]=-1;
                }
            }
        }
        out.println(min);
        printArray(position);

    }
    private static void printArray(int[] array) {
        for (int elem : array) {
            out.print(elem + " ");
        }
        out.print("\n");
    }
}
