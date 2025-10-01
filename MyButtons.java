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
    public MyButtons (int buttonEnum) {
        this.buttonEnum = buttonEnum;
        if (buttonEnum >5 && buttonEnum <11) {
        this.setText("200");
        }
        if (buttonEnum >10 && buttonEnum <16) {
        this.setText("400");
        }
        if (buttonEnum >15 && buttonEnum <21) {
        this.setText("600");
        }
        if (buttonEnum >20 && buttonEnum <26) {
        this.setText("800");
        }
        if (buttonEnum >25 && buttonEnum <=30) {
        this.setText("1000");
        }
    


        //button6
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
            //    submit.addActionListener(new ActionListener() {
            //        @Override
            //        public void actionPerformed(ActionEvent submitClicked) {
            //        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            //        });
            
            panel.setLayout(null);
            JTextField userInput = new JTextField();
            prompt.setText("Skriv ditt svar här: ");
            note.setText("Glöm inte att formulera ditt svar som en fråga!");
            prompt.setBounds(5, 10, 120, 30);
            userInput.setBounds(130, 10, 380, 30);
            note.setBounds(5, 50, 480, 20);
            question.setBounds(10, 100, 530, 50);
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

            if (userInput.getText().equalsIgnoreCase(Filmmusic.FILM_MUSIC_ANSWERS[0])) {
                System.out.println("Rätt svar!");
            } 
            }
        });
    }
}
