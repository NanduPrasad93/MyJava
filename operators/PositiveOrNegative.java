package operators;
import java.util.*;
public class PositiveOrNegative {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("This number is positive number");

        }
        else{
            System.out.println("This number is negative");
        }
        sc.close();
    }
}
