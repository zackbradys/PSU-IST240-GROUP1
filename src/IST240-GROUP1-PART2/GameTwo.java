// GameTwo.java
// IST240 - Group 1 - Project Part 2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameTwo extends JPanel implements ActionListener {

    JButton mapOne, b1, b2, b3;
    JLabel countdown, scoreTally, b1text, b2text, b3text;
    Timer time;
    String theme;
    XML_240 x2;

    int initialDelay = 1000;
    int i = 30;
    int endCount = 0;
    int score = 0;

    public GameTwo() {
        super();
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        time = new Timer(initialDelay, this);
        
        x2 = new XML_240();
        //----------------------------------------------------------
        JPanel topInstructions = new JPanel();

        JLabel text = new JLabel("<html><pre><center>Welcome to PennState DuBois Campus "
                + "<br/>Did you know that PennState Dubois trained defense specialists for the WW2 war effort?<br/>"
                + "Which year did PennState Dubois begin these classes?<br/><br/>"
                + "You have 30 seconds to click the icon next to the correct answer to earn a point.  Begin now!<br/><br/></center></pre></html>");
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setForeground(Color.white);
        text.setOpaque(false);
        topInstructions.add(text);
        topInstructions.setBackground(Color.GRAY);
        add(topInstructions, BorderLayout.NORTH);
        //----------------------------------------------------------
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        if (theme.equals("Football")) {
            Icon icon = new ImageIcon("src/images/football.jpg");
            b1 = new JButton(icon);
            b2 = new JButton(icon);
            b3 = new JButton(icon);
        }
        if (theme.equals("Java")) {
            Icon icon = new ImageIcon("src/images/javamug.jpg");
            b1 = new JButton(icon);
            b2 = new JButton(icon);
            b3 = new JButton(icon);
        }
        if (theme.equals("Math")) {
            Icon icon = new ImageIcon("src/images/math.jpg");
            b1 = new JButton(icon);
            b2 = new JButton(icon);
            b3 = new JButton(icon);
        }

        JPanel buttonOne = new JPanel();
        b1.addActionListener(this);
        buttonOne.add(b1);
        b1.setPreferredSize(new Dimension(33, 33));
        b1text = new JLabel("1938");
        b1text.setFont(new Font("Serif", Font.BOLD, 20));
        b1text.setForeground(Color.white);
        b1text.setOpaque(false);
        buttonOne.add(b1text);
        buttonOne.setBackground(Color.GRAY);
        centerPanel.add(buttonOne, BorderLayout.WEST);

        JPanel buttonTwo = new JPanel();
        b2.addActionListener(this);
        buttonTwo.add(b2);
        b2.setPreferredSize(new Dimension(33, 33));
        b2text = new JLabel("1935");
        b2text.setFont(new Font("Serif", Font.BOLD, 20));
        b2text.setForeground(Color.white);
        b2text.setOpaque(false);
        buttonTwo.add(b2text);
        buttonTwo.setBackground(Color.GRAY);
        centerPanel.add(buttonTwo, BorderLayout.CENTER);

        JPanel buttonThree = new JPanel();
        b3.addActionListener(this);
        buttonThree.add(b3);
        b3.setPreferredSize(new Dimension(33, 33));
        b3text = new JLabel("1942");
        b3text.setFont(new Font("Serif", Font.BOLD, 20));
        b3text.setForeground(Color.white);
        b3text.setOpaque(false);
        buttonThree.add(b3text);
        buttonThree.setBackground(Color.GRAY);
        centerPanel.add(buttonThree, BorderLayout.EAST);

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
        setFocusable(true);
        requestFocusInWindow();
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
            } else if (object == b1) {
                scoreTally.setText("Wrong answer!");
                repaint();
            } else if (object == b3) {
                scoreTally.setText("Correct answer!");
                repaint();
                score++;
                int GameTwoScore = score;
                x2.openWriterXML("groupOneXML.xml");
                x2.writeObject(GameTwoScore);
                x2.closeWriterXML();
            } else if (object == b2) {
                scoreTally.setText("Wrong answer!");
                repaint();
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
