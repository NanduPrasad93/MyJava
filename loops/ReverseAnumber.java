package loops;
public class ReverseAnumber {
    public static void main(String args[]){
        int num = 10897;
        while(num > 0){
            int reminder = num % 10;
            System.out.print(reminder);
            num = num/10;
        }
    }
}