package IfElsePackage;

public class SeasonProgram {
    public static void main(String[] args) {
        int month = 6;
        System.out.println("Season Program");
        switch (month){

            case 12:
            case 1:
            case 2:
            System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Wrong Input");
                break;

        }

    }
}
