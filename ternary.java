import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int mark = sc.nextInt();
        String result = (mark>33) ? "pass" : "fail";
        if(result=="pass"){
            System.out.println("you passed");
        }
        else{
            System.out.println("failed");
        }
        sc.close();
    }
    
}
