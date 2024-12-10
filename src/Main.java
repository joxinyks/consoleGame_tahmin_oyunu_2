import game_modes.ClassicMode;
import game_modes.TimedMode;
import game_modes.HardMode;
import ui.UIUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UIUtils.displayLogo();
        UIUtils.showMenu();
        int choice = getUserChoice();

        switch (choice) {
            case 1 -> ClassicMode.play();
            case 2 -> TimedMode.play();
            case 3 -> HardMode.play();
            default -> System.out.println("Geçersiz seçim. Oyun kapanıyor.");
        }
    }

    private static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seçiminizi yapın: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Lütfen geçerli bir sayı girin: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}