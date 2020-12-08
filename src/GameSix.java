
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameSix extends JPanel implements ActionListener, KeyListener {

    JButton back, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, cb, fin, campScore, countdown;
    JLabel wc, msg1, msg2, msg3;
    String theme;
    Timer time;
    JFrame bar;
    Integer cScore;
    Integer count;
    XML_240 x2;

    int i = 30;
    int initialDelay = 1000;
    int endCount = 0;

    public GameSix(String Theme) {
        super();
        setLayout(null);
        x2 = new XML_240();
        theme = Theme;
        wc = new JLabel("World Campus");
        wc.setBounds(new Rectangle(300, 20, 220, 20));
        add(wc);

        cScore = 0;
        count = 0;
        campScore = new JButton("Score; " + cScore);
        campScore.setBounds(new Rectangle(30, 400, 120, 20));
        add(campScore);

        if (theme.equals("Football")) {
            msg1 = new JLabel("Welcome to the Football Trivia!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Click the correct answers.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);

            b1 = new JButton("A touchdown is 7 points.");
            b1.setBounds(new Rectangle(290, 130, 250, 30));
            b1.addActionListener(this);
            add(b1);
            b2 = new JButton("Receivers catch the ball.");
            b2.setBounds(new Rectangle(290, 170, 250, 30));
            b2.addActionListener(this);
            add(b2);
            b3 = new JButton("A football is an oval shape.");
            b3.setBounds(new Rectangle(290, 210, 250, 30));
            b3.addActionListener(this);
            add(b3);
            b4 = new JButton("Players wear helemets.");
            b4.setBounds(new Rectangle(290, 250, 250, 30));
            b4.addActionListener(this);
            add(b4);
            b5 = new JButton("The QB hikes the ball.");
            b5.setBounds(new Rectangle(290, 290, 250, 30));
            b5.addActionListener(this);
            add(b5);
        }
        if (theme.equals("Java")) {
            msg1 = new JLabel("Welcome to the Java Trivia!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Click the correct answers.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);

            b1 = new JButton("Java is boring");
            b1.setBounds(new Rectangle(290, 130, 250, 30));
            b1.addActionListener(this);
            add(b1);
            b2 = new JButton("Math.random generates a random #.");
            b2.setBounds(new Rectangle(290, 170, 250, 30));
            b2.addActionListener(this);
            add(b2);
            b3 = new JButton("Booleans are true or false.");
            b3.setBounds(new Rectangle(290, 210, 250, 30));
            b3.addActionListener(this);
            add(b3);
            b4 = new JButton("We love Java");
            b4.setBounds(new Rectangle(290, 250, 250, 30));
            b4.addActionListener(this);
            add(b4);
            b5 = new JButton("C++ and Java are the same.");
            b5.setBounds(new Rectangle(290, 290, 250, 30));
            b5.addActionListener(this);
            add(b5);
        }
        if (theme.equals("Math")) {
            msg1 = new JLabel("Welcome to the Math Trivia!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Click the correct answers.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);

            b1 = new JButton("3.14/0 can be done.");
            b1.setBounds(new Rectangle(290, 130, 250, 30));
            b1.addActionListener(this);
            add(b1);
            b2 = new JButton("Algebra uses letter variables.");
            b2.setBounds(new Rectangle(290, 170, 250, 30));
            b2.addActionListener(this);
            add(b2);
            b3 = new JButton("1337/13 = 102.85");
            b3.setBounds(new Rectangle(290, 210, 250, 30));
            b3.addActionListener(this);
            add(b3);
            b4 = new JButton("The square root of 144 is 12.");
            b4.setBounds(new Rectangle(290, 250, 250, 30));
            b4.addActionListener(this);
            add(b4);
            b5 = new JButton("(55*12)/20 = 32.75");
            b5.setBounds(new Rectangle(290, 290, 250, 30));
            b5.addActionListener(this);
            add(b5);
        }

        fin = new JButton("Finish");
        fin.setBounds(new Rectangle(270, 380, 100, 40));
        fin.addActionListener(this);
        add(fin);

        back = new JButton("Back");
        back.setBounds(new Rectangle(270, 440, 100, 40));
        back.addActionListener(this);
        add(back);

        countdown = new JButton("Time Left: " + i);
        countdown.setBounds(new Rectangle(400, 400, 120, 20));
        add(countdown);
        addKeyListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    public void keyPressed(KeyEvent keypressEvent) {
        int object = keypressEvent.getKeyCode();
        if (object == keypressEvent.VK_SPACE) {
            time = new Timer(1000, this);
            time.start();

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (count >= 7) {

        } else {
            if (obj != b2 && obj != b3 && obj != b4 && obj != b6 && obj != b8 && obj != b12) {

            } else {
                cb = (JButton) obj;
                cb.setBackground(Color.green);
                cScore = cScore + 1;
                count = count + 1;
                campScore.setText("Score: " + cScore);
            }
            if (obj != b1 && obj != b5 && obj != b7 && obj != b9 && obj != b11) {

            } else {
                cb = (JButton) obj;
                cb.setBackground(Color.red);
                count = count + 1;

            }

        }
        if (count != 6) {

        }
        Object object = e.getSource();
        if (i > endCount) {
            if (object == time) {
                i = i - 1;

                time.setDelay(initialDelay);
                countdown.setText("Time Left: " + i);
                repaint();
            }
        } else if (i == endCount) {
            countdown.setText("Game over!");

        }
        int GameSixScore = cScore;
        x2.openWriterXML("groupOneXML.xml");
        x2.writeObject(GameSixScore);
        x2.closeWriterXML();
    }

}
