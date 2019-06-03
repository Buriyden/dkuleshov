package dkuleshov;

public class a3 {
public static void main(String[] args){
    int x=2;
    int y=5;
    int z=3;
    int a=Math.max(x,y);
    int b=Math.min(Math.max(x,y),z);
    int c=Math.min(Math.min(x,y),z);
    System.out.println(b+" "+a+" "+c);
}
}