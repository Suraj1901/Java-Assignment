package Looping;

public class EvenNumberBetween23to67 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 23;i<=67;i++){
            if(i%2==0){
                System.out.println(i);
                ++count;

            }

        }
        System.out.println("Total Number is "+count);


    }
}
