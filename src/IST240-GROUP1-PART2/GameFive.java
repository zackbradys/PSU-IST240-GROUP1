// GameFive.java
// IST240 - Group 1 - Group Project Part 2
// Brett Strausser, Zack Brady, and Lawrence Burns

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameFive extends JPanel implements ActionListener, KeyListener {

    JButton back, w1, w2, w3, w4, w5, fin, campScore, countdown;
    JLabel wrth, msg1, msg2, msg3, msg4;
    JTextField i1, i2, i3, i4, i5;
    String theme;
    Timer time;
    JFrame bar;
    Integer cScore;
    XML_240 x2;

    int i = 30;
    int initialDelay = 1000;
    int endCount = 0;

    public GameFive(String Theme) {
        super();
        setLayout(null);
        x2 = new XML_240();
        theme = Theme;
        wrth = new JLabel("Worthington");
        wrth.setBounds(new Rectangle(300, 20, 220, 20));
        add(wrth);

        cScore = 0;
        campScore = new JButton("Score: " + cScore);
        campScore.setBounds(new Rectangle(30, 400, 120, 20));
        add(campScore);

        i1 = new JTextField(30);
        i1.setBounds(new Rectangle(400, 130, 200, 30));
        add(i1);
        i2 = new JTextField(30);
        i2.setBounds(new Rectangle(400, 170, 200, 30));
        add(i2);
        i3 = new JTextField(30);
        i3.setBounds(new Rectangle(400, 210, 200, 30));
        add(i3);
        i4 = new JTextField(30);
        i4.setBounds(new Rectangle(400, 250, 200, 30));
        add(i4);
        i5 = new JTextField(30);
        i5.setBounds(new Rectangle(400, 290, 200, 30));
        add(i5);

        if (theme.equals("Football")) {
            msg1 = new JLabel("Welcome to the Football Q&A!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Type you answer into the box. Please use all lowercase.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);
            msg4 = new JLabel("When you're done, press the Finish button.");
            msg4.setBounds(new Rectangle(250, 100, 400, 20));
            add(msg4);

            w1 = new JButton("What is the 1 point kick after a TD?");
            w1.setBounds(new Rectangle(100, 130, 250, 30));
            add(w1);
            w2 = new JButton("Who kicks the ball?");
            w2.setBounds(new Rectangle(100, 170, 250, 30));
            add(w2);
            w3 = new JButton("What's the shoes wore by players?");
            w3.setBounds(new Rectangle(100, 210, 250, 30));
            add(w3);
            w4 = new JButton("What's the half-way game break?");
            w4.setBounds(new Rectangle(100, 250, 250, 30));
            add(w4);
            w5 = new JButton("Who directs the team?");
            w5.setBounds(new Rectangle(100, 290, 250, 30));
            add(w5);
        }
        if (theme.equals("Java")) {
            msg1 = new JLabel("Welcome to the Java Q&A!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Type the answer into the box. Please use all lowercase.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);
            msg4 = new JLabel("When you're done, press the Finish button.");
            msg4.setBounds(new Rectangle(250, 100, 400, 20));
            add(msg4);

            w1 = new JButton("What are these, {}?");
            w1.setBounds(new Rectangle(100, 130, 250, 30));
            add(w1);
            w2 = new JButton("Program type used to code Java?");
            w2.setBounds(new Rectangle(100, 170, 250, 30));
            add(w2);
            w3 = new JButton("Who created Java?");
            w3.setBounds(new Rectangle(100, 210, 250, 30));
            add(w3);
            w4 = new JButton("What's checking for errors?");
            w4.setBounds(new Rectangle(100, 250, 250, 30));
            add(w4);
            w5 = new JButton("What's the best language type?");
            w5.setBounds(new Rectangle(100, 290, 250, 30));
            add(w5);
        }
        if (theme.equals("Math")) {
            msg1 = new JLabel("Welcome to the Math Q&A!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Type the answer into the box. Please use all lowercase.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);
            msg4 = new JLabel("When you're done, press the Finish button.");
            msg4.setBounds(new Rectangle(250, 100, 400, 20));
            add(msg4);

            w1 = new JButton("What is this used for, -?");
            w1.setBounds(new Rectangle(100, 130, 250, 30));
            add(w1);
            w2 = new JButton("What's 5*5/5+5-5? Use numbers.");
            w2.setBounds(new Rectangle(100, 170, 250, 30));
            add(w2);
            w3 = new JButton("What's (7*21)*(5/4)? Use numbers.");
            w3.setBounds(new Rectangle(100, 210, 250, 30));
            add(w3);
            w4 = new JButton("What's does y=mx+b find?");
            w4.setBounds(new Rectangle(100, 250, 250, 30));
            add(w4);
            w5 = new JButton("What's (89/2)/3.14? Use 2 decimals.");
            w5.setBounds(new Rectangle(100, 290, 250, 30));
            add(w5);
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
    public void actionPerformed(ActionEvent ee) {
        Object object = ee.getSource();
        if (i > endCount) {
            if (object == time) {
                i = i - 1;

                time.setDelay(initialDelay);
                countdown.setText("Time Left: " + i);
                repaint();
            }
        } else if (i == endCount) {
            countdown.setText("Game over!");
            repaint();

        }

        String t1 = i1.getText();
        if ("field goal".equals(t1) || "curly braces".equals(t1) || "subtraction".equals(t1)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t2 = i2.getText();
        if ("kicker".equals(t2) || "ide".equals(t2) || "1".equals(t2)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t3 = i3.getText();
        if ("cleats".equals(t3) || "james gosling".equals(t3) || "183.75".equals(t3)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t4 = i4.getText();
        if ("halftime".equals(t4) || "debugging".equals(t4) || "slope".equals(t4)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t5 = i5.getText();
        if ("coach".equals(t5) || "java".equals(t5) || "14.17".equals(t5)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        int GameFiveScore = cScore;
        x2.openWriterXML("groupOneXML.xml");
        x2.writeObject(GameFiveScore);
        x2.closeWriterXML();
    }

}
