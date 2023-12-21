package IfElsePackage;

public class TraingleChecker {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 5;
        if (a==b && b==c){
            System.out.println("Equilateral Triangle");
        } else if (a==b || b==c || c==a) {
            System.out.println("Isosceles Triangle");

        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
