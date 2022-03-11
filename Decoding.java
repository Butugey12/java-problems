import java.util.Scanner;
import static java.lang.System.out;
//problem 33
//from 34 to 36 to 50 not done..
public class Decoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =  input.nextInt();
        String s = input.next();
        //if the position of the letter is even then put it to the right
        // if the positon of the letter is  odd then put it to the left;
        StringBuilder stringBuilder = new StringBuilder("");
        int median = s.length()/2;
        stringBuilder.append(s.charAt(0));
        for (int i = 1; i <s.length(); i++) {
            if (i%2==0){
                stringBuilder.append(s.charAt(i));
            }
            else {
                char chars = s.charAt(i);
                stringBuilder.insert(0,chars);
            }
        }
        out.println(n%2==0?stringBuilder.reverse():stringBuilder);


    }
}
