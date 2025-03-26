import java.util.*;

public class SquareofSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        float side = sc.nextFloat();
        float square = side * side;
        System.out.println("The square is " +square);
        sc.close();
    }
}
