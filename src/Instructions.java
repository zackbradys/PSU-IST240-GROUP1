
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
        JLabel text = new JLabel("<html><pre><center>~ PROGRAM INSTRUCTIONS~</center><br/>"
                + "<br/> - First, you must choose a character icon."
                + "<br/> - Second, you must choose a theme for the questions."
                + "<br/> - Once you are ready to begin, click the back button below to go"
                + "<br/> to the introduction screen, than select Start Game.</pre></html>");
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setForeground(Color.white);
        text.setOpaque(false);
        topPaint.add(text);
        topPaint.setBackground(Color.GRAY);
        add(topPaint, BorderLayout.WEST);

        JPanel centerPic = new JPanel();
        centerPic.setLayout(new GridBagLayout());
        JLabel img = new JLabel(new ImageIcon("src/images/instructionsmall.jpg"));
        centerPic.add(img);
        centerPic.setBackground(Color.GRAY);
        add(centerPic, BorderLayout.CENTER);

        JPanel southButton = new JPanel();
        insB = new JButton("Return to Introduction Screen");
        insB.setBackground(Color.blue);
        insB.setForeground(Color.white);
        insB.setFont(new Font("Serif", Font.BOLD, 20));
        insB.setFocusPainted(false);
        southButton.add(insB);
        southButton.setBackground(Color.GRAY);
        add(southButton, BorderLayout.SOUTH);
    }
}
