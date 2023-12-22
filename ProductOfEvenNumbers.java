package Looping;

public class ProductOfEvenNumbers {
    public static void main(String[] args) {
        int product = 1;
        for(int i =1;i<=10;i++){

            if(i%2==0){
                System.out.println(i);
                product = product * i;

            }
        }
        System.out.println("Product is "+product);
    }
}
