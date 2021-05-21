import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Bienvenue jeune pousse !");

        Scanner scanner = new Scanner(System.in);



        boolean shouldQuit = false;

        do {

            System.out.println("Ecrit une commande !");
            String input = scanner.nextLine();

            if ("quit".equals(input)){
                shouldQuit = true;
            }
            else if("fibo".equals(input)){
                System.out.println("Entrez un nombre :");
                int n = scanner.nextInt();
                System.out.println(fibo(n));

            }
            else{
                System.out.println("Unknown command");
            }
        } while (!shouldQuit);



    }

    private static int fibo(int n) {
        return n == 0 || n == 1 ? n : fibo(n - 1) + fibo(n - 2);
    }

}