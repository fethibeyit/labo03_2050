// Classe fizzbuzz pour tester les developpeurs

public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1 ; i<= 200 ; i++){
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("fizzbuzz");
            else if (i % 5 == 0 )
                System.out.println("buzz");
            else if (i % 3 == 0)
                System.out.println("fizz");
            else
                System.out.println(i);
        }
    }
}
