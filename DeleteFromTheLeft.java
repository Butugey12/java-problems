import java.util.Scanner;
import static java.lang.System.out;
public class DeleteFromTheLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] s = input.nextLine().toCharArray();
        char[] t = input.nextLine().toCharArray();


        int cnt =0;

        for(int i=s.length-1,j=t.length-1;i>=0&&j>=0;i--,j--){
            if(s[i]==t[j]) cnt++;
            else break;
        }
        out.println(s.length-cnt+t.length-cnt);


    }
    //problem 28
    //problem 1005B

}
