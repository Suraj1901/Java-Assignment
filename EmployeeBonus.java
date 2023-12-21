package IfElsePackage;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Salary");
        int salary = s.nextInt();
        int bonus = 0;
        if (salary>=5000){
            bonus = (salary/100)*10;
            int total = bonus+salary;
            System.out.println(total);
        } else {
            bonus = (salary/100)*5;
            int total = bonus+salary;
            System.out.println(total);

        }


    }

    }
