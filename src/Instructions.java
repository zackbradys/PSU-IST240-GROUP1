// Instructions.java
// IST240 - Group 1 Project - Part 1
// Zack Brady, Lawrence Burns, and Brett Strausser

import java.awt.*;
import javax.swing.*;

public class Instructions extends JPanel {

    JButton insB;

    public Instructions() {

        super();
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);

        JPanel topPaint = new JPanel();
        topPaint.setLayout(new GridBagLayout());     //HTML used here for formatting.
        JLabel text = new JLabel("<html><pre><center>~INSTRUCTIONS~</center><br/>"
                + "<br/> - First, you must choose a character icon."
                + "<br/> - Second, you must choose a theme for the questions."
                + "<br/> - Once you are ready to begin, click the button below to go"
                + "<br/>back to the introduction screen, than select Start Game.</pre></html>");
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setForeground(Color.white);
        text.setOpaque(false);
        topPaint.add(text);
        topPaint.setBackground(Color.GRAY);
        add(topPaint, BorderLayout.WEST);

        JPanel centerPic = new JPanel();
        centerPic.setLayout(new GridBagLayout());
        JLabel img = new JLabel(new ImageIcon("src/images/instructionsmall.jpg"));     //If I didn't give you this picture, ask Lawrence for it.
        centerPic.add(img);
        centerPic.setBackground(Color.GRAY);
        add(centerPic, BorderLayout.CENTER);

        JPanel southButton = new JPanel();
        insB = new JButton("Return to Introduction Screen");
        insB.setBackground(Color.blue);
        insB.setForeground(Color.white);
        insB.setFont(new Font("Serif", Font.BOLD, 20));
        insB.setFocusPainted(false);
        southButton.add(insB);    //The control panel listeners should be trying to pick this up and return to Introduction.
        southButton.setBackground(Color.GRAY);
        add(southButton, BorderLayout.SOUTH);
    }
}
