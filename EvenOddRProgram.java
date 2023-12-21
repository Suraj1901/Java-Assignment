package IfElsePackage;

import java.util.Scanner;

public class EvenOddRProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%2==0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
