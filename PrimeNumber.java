package Looping;

public class PrimeNumber {
    public static void main(String[] args) {
        int a = 7;
        boolean b = true;
        for(int i = 2;i<a;i++){
            if(a%i==0){
                b = false;
                break;

            }
        }
        if(b=true){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a Prime Number");
        }
    }
}
