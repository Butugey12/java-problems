import java.util.Scanner;

import static java.lang.System.out;
public class MargariteAndTheBestPresent {
    //problem 26
    //problem 1080B
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Q = input.nextInt();
        for(int i=0;i<Q;i++) {
            long l = input.nextLong();
            long r = input.nextLong();

            int sum = 0;
            while(l<=r){
                if(l%2==0){
                    sum+=l;
                }
                else {
                    sum-=l;
                }
                l++;
            }

            out.println(sum);
        }


    }


}
