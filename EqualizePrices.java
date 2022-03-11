import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
public class EqualizePrices {
    //problem 20
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int n;
        int k;
        for(int tt=0;tt<t;tt++){
            n = input.nextInt();
            k = input.nextInt();
            long[] array = new long[n];
            for(int i=0;i<n;i++){
                array[i]= input.nextInt();
            }
            Arrays.sort(array);
            long a = array[0]+k;

            int flag=0;
            int s = array.length-1;
            for(int i=0;i<n;i++){
                if(Math.abs(array[i]-a)<=k){}
                else {
                    flag++;
                    break;
                }

            }
            out.println(flag==0?a:-1);
        }
    }
}
