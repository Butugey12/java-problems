import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;
//problem 30
public class GettingAnA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];//{5,3,3,5}
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        double sum =0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        double average= sum/arr.length;
        int count=0;
        int j=0;
        int something=0;

        while(average<4.5){
            arr[j] = 5;
            j++;
            sum = sum(arr);
            average = sum/n;
            count++;

        }
        out.println(count);



    }
    public static int sum(int[] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

}
