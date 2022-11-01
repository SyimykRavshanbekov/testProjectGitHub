import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Random random = new Random();

        int i = random.nextInt();

        if (i>10){
            System.out.println(i+10);
            System.out.println("Successfull");
        }
    }
}