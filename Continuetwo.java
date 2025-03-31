import java.util.*;
public class Continuetwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        while(true){
            int num = sc.nextInt();
            if(num == -1){
                break;
            }
            if(num%10 == 0){
                continue;
            }
            System.out.println(num);
        }
        System.out.println("the end");
        sc.close();
    }
}
