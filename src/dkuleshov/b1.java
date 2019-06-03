package dkuleshov;

public class b1 {
    public static void main(String[] args){
    int c=5;
    int d=155;
    int a=25;
    int b=100;
    double random=Math.random()*(-c+d)+c;
    System.out.println(random+" from["+c+";"+d+"]");
    if ((a<=random)&&(random<=b)){
        System.out.println("in section["+a+";"+b+"]");

    }
}
}