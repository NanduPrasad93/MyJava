import java.util.*;
public class SumOfNNatural {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num){
            sum = sum+i;
            i++;
        }
        System.out.println("the sum of n natural number is " +sum);
        sc.close();
    }
}
