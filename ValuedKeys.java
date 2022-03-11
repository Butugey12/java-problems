import java.util.Scanner;
import static java.lang.System.out;
public class ValuedKeys {
    //problem 32
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean bool = false;
        String x = input.nextLine();
        String z =input.nextLine();
        StringBuilder y = new StringBuilder("");
        for(int i=0;i<x.length();i++){
            int positionX = x.charAt(i)-'a'+1;
            int positionZ = z.charAt(i)-'a'+1;
            if(x.charAt(i)==z.charAt(i)){
                y.append('z');
            }
            else if(x.charAt(i)!=z.charAt(i) && positionZ<positionX){
                y.append(z.charAt(i));
            }
            else {
                bool = true;
            }
        }
        out.println(bool?-1:y.toString());


    }
}
