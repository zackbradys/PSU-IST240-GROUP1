// Options.java
// IST240 - Group 1 - Project

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Options extends JPanel implements ActionListener {

    
    JButton Lion;
    JButton Saquon;
    JButton Frannie;
    JTextField cText;
    String character;

    JButton sports;
    JButton math;
    JButton java;
    JButton opsB;
    JTextField tText;
    String theme;

    public Options() {
        super();
        setBackground(Color.gray);
        setLayout(null);

        opsB = new JButton("Return to Introduction Screen");
        opsB.setBackground(Color.blue);
        opsB.setForeground(Color.white);
        opsB.setFont(new Font("Serif", Font.BOLD, 20));
        opsB.setFocusPainted(false);
        add(opsB);     //The control panel listeners should be trying to pick this up and return to Introduction.
        opsB.setBounds(new Rectangle(235, 620, 300, 35));

        JLabel cLabel = new JLabel("Pick Your Character");
        cLabel.setBounds(new Rectangle(350, 50, 200, 25));
        add(cLabel);

        ImageIcon Lion1 = new ImageIcon("images/Lion.png");
        Lion = new JButton("Lion");
        Lion.addActionListener(this);
        Lion.setBounds(125, 100, 150, 150);
        add(Lion);

        ImageIcon Saquon1 = new ImageIcon("images/Saquon.png");
        Saquon = new JButton("Saquon");
        Saquon.addActionListener(this);
        Saquon.setBounds(325, 100, 150, 150);
        add(Saquon);

        ImageIcon Frannie1 = new ImageIcon("images/Frannie.png");
        Frannie = new JButton("Frannie");
        Frannie.addActionListener(this);
        Frannie.setBounds(525, 100, 150, 150);
        add(Frannie);

        JLabel cTextLabel = new JLabel("Your Character");
        add(cTextLabel);
        cTextLabel.setBounds(new Rectangle(350, 275, 150, 25));
        cText = new JTextField(20);
        cText.setEditable(false);
        cText.setBounds(new Rectangle(325, 350, 150, 25));
        add(cText);

        JLabel tLabel = new JLabel("Pick Your Theme");
        tLabel.setBounds(new Rectangle(360, 350, 200, 25));
        add(tLabel);

        sports = new JButton("Sports");
        sports.addActionListener(this);
        sports.setBounds(new Rectangle(125, 400, 150, 150));
        add(sports);

        math = new JButton("Math");
        math.addActionListener(this);
        math.setBounds(new Rectangle(325, 400, 150, 150));
        add(math);

        java = new JButton("Java");
        java.addActionListener(this);
        java.setBounds(new Rectangle(525, 400, 150, 150));
        add(java);

        JLabel tTextLabel = new JLabel("Your Theme");
        add(tTextLabel);
        tTextLabel.setBounds(new Rectangle(355, 555, 150, 25));
        tText = new JTextField(20);
        tText.setEditable(false);
        tText.setBounds(new Rectangle(325, 580, 150, 25));
        add(tText);
    }

    @Override
    public void actionPerformed(ActionEvent x) {
        Object obj = x.getSource();
        if (obj == Lion) {
            character = "Lion";
            cText.setText(character);
        }
        if (obj == Saquon) {
            character = "Saquon";
            cText.setText(character);
        }
        if (obj == Frannie) {
            character = "Frannie";
            cText.setText(character);
        }
        if (obj == sports) {
            theme = "Sports";
            tText.setText(theme);
        }
        if (obj == math) {
            theme = "Math";
            tText.setText(theme);
        }
        if (obj == java) {
            theme = "Java";
            tText.setText(theme);
        }
    }
}
