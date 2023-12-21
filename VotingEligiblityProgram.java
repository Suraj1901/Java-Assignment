package IfElsePackage;

public class VotingEligiblityProgram {
    public static void main(String[] args) {
        int age = 90;
        if (age >= 18 && age <= 110){
            System.out.println("Eligible to Vote");
        }
        else {
            System.out.println("Not Eligible to Vote");
        }
    }
}
