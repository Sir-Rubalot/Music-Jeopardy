import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Jeopardy extends Main {
    public JFrame frame;
    protected JPanel panel;
    private String player1Name;
    private String player2Name;
    private Usernames[] players;
    private int questionsAnswered = 0;
    private final int totalQuestions = 25;

    private void showWinner() {
        if (players[0].getTotalScore() > players[1].getTotalScore()) {
            System.out.println("Vinnaren är " + players[0].getName() + " med " + players[0].getTotalScore() + " poäng. Grattis!");
        } else if (players[1].getTotalScore() > players[0].getTotalScore()) {
            System.out.println("Vinnaren är " + players[1].getName() + " med " + players[1].getTotalScore() + " poäng. Grattis!");
        } else {
            System.out.println("Det blev oavgjort. Grattis till båda!");
        }
    }

    public void allQuestionsAnswered() {
        questionsAnswered++;
        if (questionsAnswered == totalQuestions) {
            System.out.println("------------------");
            System.out.println("Spelet är slut!");
            for (Usernames p : players) {
                System.out.println(p.getName() + " fick " + p.getTotalScore() + " poäng. ");
            }
            showWinner();
        }
    }

    public Jeopardy(String p1Name, String p2Name) {
        this.player1Name = p1Name;
        this.player2Name = p2Name;
        this.players = new Usernames[2];
        this.players[0] = new Usernames(p1Name);
        this.players[1] = new Usernames(p2Name);
        this.frame = new JFrame("Music Jeopardy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel(new GridLayout(6, 5, 10, 10));
        panel.setPreferredSize(new Dimension(800, 500));
        panel.setBackground(Color.BLUE);
          
        JButton button1 = new JButton("Filmmusik");
        panel.add(button1);
        JButton button2 = new JButton("Hip Hop");
        panel.add(button2);
        JButton button3 = new JButton("Rock");
        panel.add(button3);
        JButton button4 = new JButton("Oldies");
        panel.add(button4);
        JButton button5 = new JButton("90's");
        panel.add(button5);
        MyButtons button6 = new MyButtons(6, p1Name, p2Name, players, this);
        panel.add(button6);
        MyButtons button7 = new MyButtons(7, p1Name, p2Name, players, this);
        panel.add(button7);
        MyButtons button8 = new MyButtons(8, p1Name, p2Name, players, this);
        panel.add(button8);
        MyButtons button9 = new MyButtons(9, p1Name, p2Name, players, this);
        panel.add(button9);
        MyButtons button10 = new MyButtons(10, p1Name, p2Name, players, this);
        panel.add(button10);
        MyButtons button11 = new MyButtons(11, p1Name, p2Name, players, this);
        panel.add(button11);
        MyButtons button12 = new MyButtons(12, p1Name, p2Name, players, this);
        panel.add(button12);
        MyButtons button13 = new MyButtons(13, p1Name, p2Name, players, this);
        panel.add(button13);
        MyButtons button14 = new MyButtons(14, p1Name, p2Name, players, this);
        panel.add(button14);
        MyButtons button15 = new MyButtons(15, p1Name, p2Name, players, this);
        panel.add(button15);
        MyButtons button16 = new MyButtons(16, p1Name, p2Name, players, this);
        panel.add(button16);
        MyButtons button17 = new MyButtons(17, p1Name, p2Name, players, this);
        panel.add(button17);
        MyButtons button18 = new MyButtons(18, p1Name, p2Name, players, this);
        panel.add(button18);
        MyButtons button19 = new MyButtons(19, p1Name, p2Name, players, this);
        panel.add(button19);
        MyButtons button20 = new MyButtons(20, p1Name, p2Name, players, this);
        panel.add(button20);
        MyButtons button21 = new MyButtons(21, p1Name, p2Name, players, this);
        panel.add(button21);
        MyButtons button22 = new MyButtons(22, p1Name, p2Name, players, this);
        panel.add(button22);
        MyButtons button23 = new MyButtons(23, p1Name, p2Name, players, this);
        panel.add(button23);
        MyButtons button24 = new MyButtons(24, p1Name, p2Name, players, this);
        panel.add(button24);
        MyButtons button25 = new MyButtons(25, p1Name, p2Name, players, this);
        panel.add(button25);
        MyButtons button26 = new MyButtons(26, p1Name, p2Name, players, this);
        panel.add(button26);
        MyButtons button27 = new MyButtons(27, p1Name, p2Name, players, this);
        panel.add(button27);
        MyButtons button28 = new MyButtons(28, p1Name, p2Name, players, this);
        panel.add(button28);
        MyButtons button29 = new MyButtons(29, p1Name, p2Name, players, this);
        panel.add(button29);
        MyButtons button30 = new MyButtons(30, p1Name, p2Name, players, this);
        panel.add(button30);
    }

public void show() {
    frame.add(panel);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    }
}
