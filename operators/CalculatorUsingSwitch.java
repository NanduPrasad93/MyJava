package operators;
import java.util.*;
public class CalculatorUsingSwitch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter 1 for additon , 2 for subtration ,3 for divition and 4 for multiplication");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print(a + b);
                break;
            case 2:
                System.out.print(a - b);
                break;
            default:
                System.out.println("get out moron");

        sc.close();
        }
    }
}
