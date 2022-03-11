
import java.util.Arrays;
import java.util.Scanner;
//problem 31
import static java.lang.System.out;
public class FafaAndTheGates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String string = input.next();
        int count=0;
        int x=0;
        int y=0;
        for(int i=0;i<n-1;i++){
            if(string.charAt(i)=='U'){
                x++;
            }
            else {
                y++;
            }

            if(x==y && string.charAt(i)==string.charAt(i+1)){
                count++;
            }
        }
        out.println(count);
    }

}
