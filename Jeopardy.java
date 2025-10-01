import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Jeopardy extends Main {
    public JFrame frame;
    protected JPanel panel;

    public <MyClass> Jeopardy() {
        frame = new JFrame();
        frame.setTitle("Musik Jeopardy!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.BLUE);

        //Buttons grid buildup
        panel = new JPanel(new GridLayout(6, 5, 10, 10));
        for (int i = 1; i < 2; i++) {
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

        MyButtons button6 = new MyButtons(6);
        panel.add(button6);

        MyButtons button7 = new MyButtons(7);
        panel.add(button7);

        MyButtons button8 = new MyButtons(8);
        panel.add(button8);
        
        MyButtons button9 = new MyButtons(9);
        panel.add(button9);

        MyButtons button10 = new MyButtons(10);
        panel.add(button10);

        MyButtons button11 = new MyButtons(11);
        panel.add(button11);

        MyButtons button12 = new MyButtons(12);
        panel.add(button12);

        MyButtons button13 = new MyButtons(13);
        panel.add(button13);

        MyButtons button14 = new MyButtons(14);
        panel.add(button14);

        MyButtons button15 = new MyButtons(15);
        panel.add(button15);

        MyButtons button16 = new MyButtons(16);
        panel.add(button16);

        MyButtons button17 = new MyButtons(17);
        panel.add(button17);

        MyButtons button18 = new MyButtons(18);
        panel.add(button18);

        MyButtons button19 = new MyButtons(19);
        panel.add(button19);

        MyButtons button20 = new MyButtons(20);
        panel.add(button20);

        MyButtons button21 = new MyButtons(21);
        panel.add(button21);

        MyButtons button22 = new MyButtons(22);
        panel.add(button22);

        MyButtons button23 = new MyButtons(23);
        panel.add(button23);

        MyButtons button24 = new MyButtons(24);
        panel.add(button24);

        MyButtons button25 = new MyButtons(25);
        panel.add(button25);

        MyButtons button26 = new MyButtons(26);
        panel.add(button26);

        MyButtons button27 = new MyButtons(27);
        panel.add(button27);

        MyButtons button28 = new MyButtons(28);
        panel.add(button28);

        MyButtons button29 = new MyButtons(29);
        panel.add(button29);

        MyButtons button30 = new MyButtons(30);
        panel.add(button30);
        }
    }

    public void show() {
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        }
    }
