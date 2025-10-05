import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till Musik Jeopardy!");
        System.out.println("Ange spelarnamn");
        System.out.print("Spelare 1: ");
        String User1 = scanner.nextLine();
        System.out.print("Spelare 2: ");
        String User2 = scanner.nextLine();
        
        String player1Name = User1;
        String player2Name = User2;

        System.out.println("Spelare 1 börjar.");
        System.out.println("Glöm inte att formulera svaret som en fråga!");
            scanner.close();

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {       
                Jeopardy frame = new Jeopardy(player1Name, player2Name);
                frame.show();
            }
        });
    }
}
