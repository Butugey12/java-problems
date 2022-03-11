import java.lang.System.*;
import static java.lang.System.out;
import java.util.Scanner;
public class CandiesDivision1283B {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int tt=0;tt<t;tt++){
            int n = input.nextInt();
            int k = input.nextInt();
            boolean bool = false;

            if(n%k==0 || n<k)
                bool = true;

            if(bool){
                out.println(n);
            }else{
                int max = (n-n%k)+k/2;
                out.println(max);
            }

        }

    }
}
