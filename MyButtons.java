import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;

public class MyButtons extends JButton {
    int buttonEnum;
    int score;
    static boolean player1Turn = true;
    private String player1Name;
    private String player2Name;
    private Usernames [] players;
    private Jeopardy jeopardyRef;

    private void switchPlayer() {
        player1Turn = !player1Turn;
    }

    public MyButtons (int buttonEnum, String p1Name, String p2Name, Usernames[]playersRef, Jeopardy jeopardy) {
        this.buttonEnum = buttonEnum;
        this.player1Name = p1Name;
        this.player2Name = p2Name;
        this.players = playersRef;
        this.jeopardyRef = jeopardy;

        if (players[0] == null) {
            players[0] = new Usernames("Spelare 1");
            players[1] = new Usernames("Spelare 2");
        }
        if (buttonEnum >5 && buttonEnum <=10) {
        this.setText("200");
        this.score = 200;
        }
        if (buttonEnum >10 && buttonEnum <=15) {
        this.setText("400");
        this.score = 400;
        }
        if (buttonEnum >15 && buttonEnum <=20) {
        this.setText("600");
        this.score = 600;
        }
        if (buttonEnum >20 && buttonEnum <=25) {
        this.setText("800");
        this.score = 800;
        }
        if (buttonEnum >25 && buttonEnum <=30) {
        this.setText("1000");
        this.score = 1000;
        }
    
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {    
            JFrame frame = new JFrame();
            frame.setTitle("Fråga");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setBackground(Color.BLUE);
            JPanel panel = new JPanel();
            JLabel question = new JLabel();
            JLabel prompt = new JLabel();
            JLabel note = new JLabel();
            JButton submit = new JButton("Submit");
    
            panel.setLayout(null);
            JTextField userInput = new JTextField();
            prompt.setText("Skriv ditt svar här: ");
            note.setText("Glöm inte att formulera ditt svar som en fråga!");
            prompt.setBounds(5, 10, 120, 30);
            userInput.setBounds(130, 10, 380, 30);
            note.setBounds(5, 50, 480, 20);
            question.setBounds(10, 100, 800, 50);
            submit.setBounds(235, 150, 80, 30);
            switch (buttonEnum) {
                case 6: question.setText(Filmmusic.FILM_MUSIC_QUESTIONS[0]); break;
                case 11:question.setText(Filmmusic.FILM_MUSIC_QUESTIONS[1]); break;
                case 16:question.setText(Filmmusic.FILM_MUSIC_QUESTIONS[2]); break;
                case 21:question.setText(Filmmusic.FILM_MUSIC_QUESTIONS[3]); break;
                case 26:question.setText(Filmmusic.FILM_MUSIC_QUESTIONS[4]); break;

                case 7:question.setText(HipHop.HIPHOP_QUESTIONS[0]); break;
                case 12:question.setText(HipHop.HIPHOP_QUESTIONS[1]); break;
                case 17:question.setText(HipHop.HIPHOP_QUESTIONS[2]); break;
                case 22:question.setText(HipHop.HIPHOP_QUESTIONS[3]); break;
                case 27:question.setText(HipHop.HIPHOP_QUESTIONS[4]); break;

                case 8:question.setText(Rock.ROCK_QUESTIONS[0]); break;
                case 13:question.setText(Rock.ROCK_QUESTIONS[1]); break;
                case 18:question.setText(Rock.ROCK_QUESTIONS[2]); break;
                case 23:question.setText(Rock.ROCK_QUESTIONS[3]); break;
                case 28:question.setText(Rock.ROCK_QUESTIONS[4]); break;

                case 9:question.setText(Oldies.OLDIES_QUESTIONS[0]); break;
                case 14:question.setText(Oldies.OLDIES_QUESTIONS[1]); break;
                case 19:question.setText(Oldies.OLDIES_QUESTIONS[2]); break;
                case 24:question.setText(Oldies.OLDIES_QUESTIONS[3]); break;
                case 29:question.setText(Oldies.OLDIES_QUESTIONS[4]); break;

                case 10:question.setText(Nineties.NINETIES_QUESTIONS[0]); break;
                case 15:question.setText(Nineties.NINETIES_QUESTIONS[1]); break;
                case 20:question.setText(Nineties.NINETIES_QUESTIONS[2]); break;
                case 25:question.setText(Nineties.NINETIES_QUESTIONS[3]); break;
                case 30:question.setText(Nineties.NINETIES_QUESTIONS[4]); break;

                default: question.setText("Couldnt find question"); break;
            }
            panel.setPreferredSize(new Dimension(550, 300));
            panel.add(prompt);
            panel.add(note);
            panel.add(question);
            panel.add(userInput);
            panel.add(submit);
            frame.add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            setVisible(false);

            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent submit) {
                    frame.dispose();
                    var correctResponse = switch (buttonEnum) {
                        case 6 -> Filmmusic.FILM_MUSIC_ANSWERS[0];
                        case 11 -> Filmmusic.FILM_MUSIC_ANSWERS[1];
                        case 16 -> Filmmusic.FILM_MUSIC_ANSWERS[2];
                        case 21 -> Filmmusic.FILM_MUSIC_ANSWERS[3];
                        case 26 -> Filmmusic.FILM_MUSIC_ANSWERS[4];

                        case 7 -> HipHop.HIPHOP_ANSWERS[0];
                        case 12 -> HipHop.HIPHOP_ANSWERS[1];
                        case 17 -> HipHop.HIPHOP_ANSWERS[2];
                        case 22 -> HipHop.HIPHOP_ANSWERS[3];
                        case 27 -> HipHop.HIPHOP_ANSWERS[4];

                        case 8 -> Rock.ROCK_ANSWERS[0];
                        case 13 -> Rock.ROCK_ANSWERS[1];
                        case 18 -> Rock.ROCK_ANSWERS[2];
                        case 23 -> Rock.ROCK_ANSWERS[3];
                        case 28 -> Rock.ROCK_ANSWERS[4];

                        case 9 -> Oldies.OLDIES_ANSWERS[0];
                        case 14 -> Oldies.OLDIES_ANSWERS[1];
                        case 19 -> Oldies.OLDIES_ANSWERS[2];
                        case 24 -> Oldies.OLDIES_ANSWERS[3];
                        case 29 -> Oldies.OLDIES_ANSWERS[4];

                        case 10 -> Nineties.NINETIES_ANSWERS[0];
                        case 15 -> Nineties.NINETIES_ANSWERS[1];
                        case 20 -> Nineties.NINETIES_ANSWERS[2];
                        case 25 -> Nineties.NINETIES_ANSWERS[3];
                        case 30 -> Nineties.NINETIES_ANSWERS[4];

                        default -> "fel";
                        };
                        if (correctResponse.equalsIgnoreCase(userInput.getText())) {
                            System.out.println("Helt rätt! Fortsätt med nästa fråga.");
                            int currentPlayerIndex = player1Turn ? 0 : 1;
                            players[currentPlayerIndex].addScore(score);
                            System.out.println(players[currentPlayerIndex].getName() + " har " + players[currentPlayerIndex].getTotalScore() + " poäng");
                        } else {
                            System.out.println("Aj aj, det blev lite tokigt!!");
                            int currentPlayerIndex = player1Turn ? 0 : 1;
                            players[currentPlayerIndex].subtractScore(score);
                            switchPlayer();
                            currentPlayerIndex = player1Turn ? 0 : 1;
                            System.out.println("Nu är det " + players[currentPlayerIndex].getName() + "s tur!");
                            for (Usernames player : players) {
                                System.out.println(player.getName() + " har " + player.getTotalScore() + " poäng.");                 
                            }
                        }
                        jeopardyRef.allQuestionsAnswered();
                    }
                });
            }
        });
    }
}
