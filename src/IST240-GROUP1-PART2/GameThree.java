// GameThree.java
// IST240 - Group 1 - Group Project Part 2
// Brett Strausser, Zack Brady, and Lawrence Burns

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameThree extends JPanel implements ActionListener {

    JButton mapOne, b1;
    JLabel countdown, scoreTally;
    JTextField textTry;
    Timer time;
    String theme;
    XML_240 x2;

    int initialDelay = 1000;
    int i = 10;
    int endCount = 0;
    int score = 0;

    public GameThree() {
        super();
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        time = new Timer(initialDelay, this);
        
        x2 = new XML_240();
    //----------------------------------------------------------
        JPanel topInstructions = new JPanel();

        JLabel text = new JLabel("<html><pre><center>Welcome to PennState Wilkes-Barre Campus "
                + "<br/>Type the following fact about PennState Wilkes-Barre into the text box below:<br/><br/>"
                + "Established in 1916 and located on a scenic estate in Northeastern Pennsylvania"
                + "<br> just nine miles from Wilkes-Barre, Penn State Wilkes-Barre is the oldest"
                + "<br/> institution of higher learning in the Wyoming Valley.<br/><br/>"
                + "You have 60 seconds type and click the icon next to the text box to earn a point.  Begin now!<br/><br/></center></pre></html>");
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setForeground(Color.white);
        text.setOpaque(false);
        topInstructions.add(text);
        topInstructions.setBackground(Color.GRAY);
        add(topInstructions, BorderLayout.NORTH);
    //----------------------------------------------------------
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());

        textTry = new JTextField("", 60);
        centerPanel.add(textTry);

        if (theme.equals("Football")) {
            Icon icon = new ImageIcon("src/images/football.jpg");
            b1 = new JButton(icon);
        }
        if (theme.equals("Java")) {
            Icon icon = new ImageIcon("src/images/javamug.jpg");
            b1 = new JButton(icon);
        }
        if (theme.equals("Math")) {
            Icon icon = new ImageIcon("src/images/math.jpg");
            b1 = new JButton(icon);
        }
        b1.addActionListener(this);
        centerPanel.add(b1);
        b1.setPreferredSize(new Dimension(33, 33));

        centerPanel.setBackground(Color.GRAY);
        add(centerPanel, BorderLayout.CENTER);
    //----------------------------------------------------------
        JPanel southButton = new JPanel();
        time.start();
        countdown = new JLabel("Time Left: " + i);
        countdown.setFont(new Font("Serif", Font.BOLD, 20));
        countdown.setForeground(Color.white);
        countdown.setOpaque(false);
        southButton.add(countdown);

        mapOne = new JButton("Return to Map Screen");
        mapOne.setBackground(Color.blue);
        mapOne.setForeground(Color.white);
        mapOne.setFont(new Font("Serif", Font.BOLD, 20));
        mapOne.setFocusPainted(false);
        southButton.add(mapOne);
        southButton.setBackground(Color.GRAY);

        scoreTally = new JLabel("Select!");
        scoreTally.setFont(new Font("Serif", Font.BOLD, 20));
        scoreTally.setForeground(Color.white);
        scoreTally.setOpaque(false);
        southButton.add(scoreTally);
        add(southButton, BorderLayout.SOUTH);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setFocusable(false);
        requestFocusInWindow();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object object = actionEvent.getSource();
        String textEntered = textTry.getText();
        String textVerify = ("Established in 1916 and located on a scenic estate in Northeastern Pennsylvania just nine miles from Wilkes-Barre, Penn State Wilkes-Barre is the oldest institution of higher learning in the Wyoming Valley.");
        if (i > endCount) {
            if (object == time) {
                i = i - 1;
                time.setDelay(initialDelay);
                countdown.setText("Time Left: " + i);
                repaint();
            } else if (object == b1) {
                if (textEntered.equals(textVerify)) {
                    scoreTally.setText("Correct answer!");
                    repaint();
                    score++;
                    int GameThreeScore = score;
                    x2.openWriterXML("groupOneXML.xml");
                    x2.writeObject(GameThreeScore);
                    x2.closeWriterXML();
                } else {
                    scoreTally.setText("Wrong answer!");
                    repaint();
                }
            }
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
