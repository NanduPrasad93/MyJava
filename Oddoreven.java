import java.util.*;
public class Oddoreven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("This number is even");
        }
        else if(num % 2 != 0){
            System.out.println("This number is odd");
        }
        else{
            System.out.println("This number is 0 ");
        }
        sc.close();
    }
}
