package dkuleshov;
public class a2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 3;
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Уравнение не имеет sqrt");
        } else if (d == 0) {
            double x0 = -b / (2 * a);
            System.out.println(x0);
        } else if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}