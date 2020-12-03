// Credits.java
// IST240 - Group 1 - Project Part 2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Credits extends JPanel {

    JButton credB;

    public Credits() {
        super();
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);

        JPanel topPaint = new JPanel();
        JLabel text = new JLabel("<html><pre><center>This project was coded by the survivors of IST240 - Group 1:"
                + "<br/>Brett Strausser"
                + "<br/>Zack Brady"
                + "<br/>Lawrence Burns</center></pre></html>");
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setForeground(Color.white);
        text.setOpaque(false);
        topPaint.add(text);
        topPaint.setBackground(Color.GRAY);
        add(topPaint, BorderLayout.NORTH);

        JPanel centerPic = new JPanel();
        centerPic.setLayout(new GridBagLayout());
        JLabel img = new JLabel(new ImageIcon("src/images/codesmall.jpg"));
        centerPic.add(img);
        centerPic.setBackground(Color.GRAY);
        add(centerPic, BorderLayout.CENTER);

        JPanel southButton = new JPanel();
        credB = new JButton("Return to Introduction Screen");
        credB.setBackground(Color.blue);
        credB.setForeground(Color.white);
        credB.setFont(new Font("Serif", Font.BOLD, 20));
        credB.setFocusPainted(false);
        southButton.add(credB);
        southButton.setBackground(Color.GRAY);
        add(southButton, BorderLayout.SOUTH);
    }
}
