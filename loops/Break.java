package loops;
import java.util.*;
public class Break{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter a number");
            int num = sc.nextInt();
            if(num%10 == 0)
                break;
        }
        System.out.println("you entered multiple of ten");
        sc.close();
    }
}
