package game_modes;

import java.util.Scanner;

public class HardMode {
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess;
        int maxAttempts = 5; // Maksimum 5 tahmin hakkı

        System.out.println("Zor Mod Başladı! 1 ile 100 arasında bir sayı tahmin edin. (Maksimum 5 tahmin hakkı)");

        while (attempts < maxAttempts) {
            System.out.print("Tahmininiz: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Lütfen geçerli bir sayı girin: ");
                scanner.next();
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Daha büyük bir sayı deneyin!");
            } else if (guess > numberToGuess) {
                System.out.println("Daha küçük bir sayı deneyin!");
            } else {
                System.out.println("Tebrikler! " + attempts + " denemede doğru tahmini yaptınız.");
                break;
            }

            if (attempts == maxAttempts) {
                System.out.println("Tahmin hakkınız bitti! Doğru sayı: " + numberToGuess);
            }
        }
    }
}