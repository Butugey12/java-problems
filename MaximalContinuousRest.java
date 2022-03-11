import java.util.Scanner;
import java.util.*;
import static java.lang.System.out;
public class MaximalContinuousRest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //int[] arr = new int[n*2];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int k = input.nextInt();
            list.add(k);
        }
        int a=0;
        for(int i=n;i<n*2;i++){
            list.add(list.get(a++));
        }
        //out.println(list.toString());
        int b=0;
        int max=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1){
                b++;
                max =Math.max(max,b);

            }
            else {
                b =0;
            }

        }
        out.println(max);

    }
}
