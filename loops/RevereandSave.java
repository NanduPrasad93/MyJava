package loops;
public class RevereandSave {
    public static void main(String args[]){
        int num = 29704;
        int reverse = 0;
        while(num>0){
            reverse = (reverse * 10 ) + (num % 10);
            num = num/10;
        }
        System.out.println(reverse);
    }
}
