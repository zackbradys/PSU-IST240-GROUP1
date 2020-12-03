// GameFour.java
// IST240 - Group 1 - Group Project Part 2
// Brett Strausser, Zack Brady, and Lawrence Burns

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameFour extends JPanel implements ActionListener, KeyListener {

    JButton back, w1, w2, w3, w4, w5, fin, campScore, countdown;
    JLabel hzltn, msg1, msg2, msg3, msg4;
    JTextField i1, i2, i3, i4, i5;
    String theme;
    Timer time;
    JFrame bar;
    Integer cScore;
    XML_240 x2;

    int i = 30;
    int initialDelay = 1000;
    int endCount = 0;

    public GameFour(String Theme) {
        super();
        setLayout(null);
        x2 = new XML_240();
        theme = Theme;
        hzltn = new JLabel("Hazelton");
        hzltn.setBounds(new Rectangle(300, 20, 220, 20));
        add(hzltn);

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
            msg1 = new JLabel("Welcome to the Football Word Scramble!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Type the correct version of the scrambled word into the bo.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);
            msg4 = new JLabel("When you're done, press the Finish button.");
            msg4.setBounds(new Rectangle(250, 100, 400, 20));
            add(msg4);

            w1 = new JButton("baotlaflo");
            w1.setBounds(new Rectangle(100, 130, 250, 30));
            add(w1);
            w2 = new JButton("ihla rmya asps");
            w2.setBounds(new Rectangle(100, 170, 250, 30));
            add(w2);
            w3 = new JButton("eafyts");
            w3.setBounds(new Rectangle(100, 210, 250, 30));
            add(w3);
            w4 = new JButton("raeckauebtraqc");
            w4.setBounds(new Rectangle(100, 250, 250, 30));
            add(w4);
            w5 = new JButton("uwcnotdoh");
            w5.setBounds(new Rectangle(100, 290, 250, 30));
            add(w5);
        }
        if (theme.equals("Java")) {
            msg1 = new JLabel("Welcome to the Java Word Scramble!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Type the correct version of the scrambled word into the bo.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);
            msg4 = new JLabel("When you're done, press the Finish button.");
            msg4.setBounds(new Rectangle(250, 100, 400, 20));
            add(msg4);

            w1 = new JButton("rucyl reabsc");
            w1.setBounds(new Rectangle(100, 130, 250, 30));
            add(w1);
            w2 = new JButton("sietrnle");
            w2.setBounds(new Rectangle(100, 170, 250, 30));
            add(w2);
            w3 = new JButton("hotedm");
            w3.setBounds(new Rectangle(100, 210, 250, 30));
            add(w3);
            w4 = new JButton("uotnrscortc");
            w4.setBounds(new Rectangle(100, 250, 250, 30));
            add(w4);
            w5 = new JButton("uegdrebeg");
            w5.setBounds(new Rectangle(100, 290, 250, 30));
            add(w5);
        }
        if (theme.equals("Math")) {
            msg1 = new JLabel("Welcome to the Math Word Scramble!");
            msg1.setBounds(new Rectangle(250, 40, 400, 20));
            add(msg1);
            msg2 = new JLabel("Type the correct version of the scrambled word into the box.");
            msg2.setBounds(new Rectangle(250, 60, 400, 20));
            add(msg2);
            msg3 = new JLabel("Press the Space Bar to Start.");
            msg3.setBounds(new Rectangle(250, 80, 400, 20));
            add(msg3);
            msg4 = new JLabel("When you're done, press the Finish button.");
            msg4.setBounds(new Rectangle(250, 100, 400, 20));
            add(msg4);

            w1 = new JButton("nolg ivniiosd");
            w1.setBounds(new Rectangle(100, 130, 250, 30));
            add(w1);
            w2 = new JButton("qesrau otro");
            w2.setBounds(new Rectangle(100, 170, 250, 30));
            add(w2);
            w3 = new JButton("mrnetygrooit");
            w3.setBounds(new Rectangle(100, 210, 250, 30));
            add(w3);
            w4 = new JButton("meyogert");
            w4.setBounds(new Rectangle(100, 250, 250, 30));
            add(w4);
            w5 = new JButton("squale");
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
        if (object == keypressEvent.VK_SPACE) {;
            time = new Timer(initialDelay, this);
            time.start();

        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = actionEvent.getSource();

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

        String t1 = i1.getText();
        if ("football".equals(t1) || "curly braces".equals(t1) || "long division".equals(t1)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t2 = i2.getText();
        if ("hail mary pass".equals(t2) || "listener".equals(t2) || "square root".equals(t2)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t3 = i3.getText();
        if ("safety".equals(t3) || "method".equals(t3) || "trigonometry".equals(t3)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t4 = i4.getText();
        if ("quarterback".equals(t4) || "constructor".equals(t4) || "geometry".equals(t4)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        String t5 = i5.getText();
        if ("touchdown".equals(t5) || "debugger".equals(t5) || "equals".equals(t5)) {
            cScore = cScore + 1;
            campScore.setText("Score: " + cScore);
        }
        
        int GameFourScore = cScore;
        x2.openWriterXML("groupOneXML.xml");
        x2.writeObject(GameFourScore);
        x2.closeWriterXML();
    }

}
