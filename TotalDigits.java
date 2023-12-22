package Looping;

public class TotalDigits {
    public static void main(String[] args) {
        int i = 199887;
        int count = 0;
        while (i!=0){
            i/=10;
            count++;
        }



        System.out.println("Total Digits "+count);
    }
}
