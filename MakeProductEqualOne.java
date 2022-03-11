import static java.lang.System.out;
import java.util.Scanner;
public class MakeProductEqualOne {
    //1206B
    //problem19
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long[] array = new long[n];
        for(int i=0;i<n;i++){
            array[i]= input.nextInt();
        }
        long cost=0;
        int negative=0;
        int countZeros=0;
        for (long value : array) {
            if (value > 0) {
                cost += value - 1;
            }
            if (value < 0) {
                cost+=-1-value;
                negative++;
            }
            if (value == 0) {
                cost++;
                countZeros++;
            }
        }
        if(negative%2!=0 && countZeros==0){
            cost+=2;
        }

        out.println(cost);

        


    }
}
