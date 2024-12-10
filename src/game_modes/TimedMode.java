package game_modes;

import java.util.Scanner;

public class TimedMode {
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess;
        long startTime = System.currentTimeMillis();
        long timeLimit = 30000; // 30 saniye süre

        System.out.println("Zamana Karşı Mod Başladı! 1 ile 100 arasında bir sayı tahmin edin.");

        while (true) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            if (elapsedTime > timeLimit) {
                System.out.println("Zaman doldu! Oyun bitti.");
                break;
            }

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
        }
    }
}