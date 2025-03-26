import java.util.*;

public class TaxToTheItem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Price of the items");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float book = sc.nextFloat();
        float pencil_amount = 0.18f * pencil;
        float pen_amount = 0.18f * pen;
        float book_amount = 0.18f * book;       
        float total_price = (pen_amount + pencil_amount + book_amount) + (book + pencil + pen);
        System.out.println("total price include tax is "+total_price);
        sc.close();
    }
}
