import java.util.*;

import static java.lang.System.out;
public class ParityAlternatedDeletions {
    //problem 22
    //problem 1144B
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        List<Long> listEven = new ArrayList<>();
        List<Long> listOdd = new ArrayList<>();

        long odd=0;
        long even=0;
        for(int i=0;i<n;i++){
            long k = input.nextLong();
            if(k%2==0){
                listEven.add(k);
                even++;
            }
            else{
                listOdd.add(k);
                odd++;
            }
        }
        if(Math.abs(even-odd)<=1){
            out.println(0);
        }
        else {
            long diff;
            long min=0;
            if(even>odd){
                diff=even - odd-1;
                Collections.sort(listEven);
                for(int j=0;j<diff;j++){
                    min+=listEven.get(j);
                }
            }
            else{
                diff= odd-even-1;
                Collections.sort(listOdd);
                for(int i=0;i<diff;i++){
                    min+=listOdd.get(i);
                }
            }
            out.println(min);
        }

    }
}
