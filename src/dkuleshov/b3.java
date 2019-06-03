package dkuleshov;
import java.util.Scanner;
public class b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = scanner.nextInt();
        int sum=0;
        if (n<0) {
            System.out.println("Вы ввели отрицательнок число");
        }
        else {
            for(int i = 0; i <=n; i++) {
                sum+=i;
            }
        }
        System.out.println("сумма от 1 до " + n + " = " + sum);
    }
}
