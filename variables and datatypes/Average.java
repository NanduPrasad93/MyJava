import java.util.*;

public class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.println("The Average is " +avg);
        sc.close();
    }
}
