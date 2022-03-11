
import java.util.Scanner;
import static java.lang.System.out;
//problem 51
//problem 1136B
public class NastyaIsPlayingComputerGames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k =input.nextInt();
        if(n==k ||  k==1 || n==2){
            out.println(3*n);
        }
        else {
            int left = k-1;
            int right = n-k;
            int count=0;
            if(right<left){
                count = 3+(right*3)+right+(left*3);
            }
            else {
                count = 3 +(left*3)+left+(right*3);
            }
            out.println(count);
        }
    }
}

