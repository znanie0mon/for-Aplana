/**
 * Created by Владимир on 14.03.2017.
 */
public class Block1_HW4 {
    public static void main(String[] args) {
        int n = 234;
        int a = n%10;
        int b = (n/10)%10;
        int c = (n/100)%10;
        System.out.println("Сумма всех чисел числа "+n+" Равна "+(a+b+c));
    }

}
