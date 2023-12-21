package IfElsePackage;

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int marks = s.nextInt();
        if (marks>=50){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
    }
}
