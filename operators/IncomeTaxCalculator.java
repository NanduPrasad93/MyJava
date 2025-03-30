package operators;
import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        float salary = sc.nextFloat();
        float tax;
        if(salary<500000){
            System.out.println("You dont need to pay tax");
        }
        else if((salary>500000) && (salary<1000000)){
            tax = salary * 0.2f;
            System.out.println("you have to pay tax " +tax);
        }
        else{
            tax = salary * 0.3f;
            System.out.println("you have to pay tax " +tax);
        }
        sc.close();
    }
}
