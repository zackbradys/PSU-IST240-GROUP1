// Options.java
// IST240 - Group 1 - Group Project Part 2
// Brett Strausser, Zack Brady, and Lawrence Burns

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Options extends JPanel implements ActionListener {

    JButton Lion, Saquon, Frannie, sports, math, java, opsB;

    JTextField cText, tText;
    
    String theme, character;

    public Options() {
        super();
        setBackground(Color.gray);
        setLayout(null);

        opsB = new JButton("Return to Introduction Screen");
        opsB.setBackground(Color.blue);
        opsB.setForeground(Color.white);
        opsB.setFont(new Font("Serif", Font.BOLD, 20));
        opsB.setFocusPainted(false);
        opsB.setBounds(new Rectangle(235, 620, 300, 35));
        add(opsB);

        JLabel cLabel = new JLabel("Pick Your Character");
        cLabel.setBounds(new Rectangle(350, 50, 200, 25));
        add(cLabel);
        
        Icon lionIcon = new ImageIcon("src/images/Lion.png");
        Lion = new JButton(lionIcon);
        Lion.addActionListener(this);
        Lion.setBounds(125, 100, 150, 150);
        add(Lion);

        Icon saquonIcon = new ImageIcon("src/images/Saquon.png");
        Saquon = new JButton(saquonIcon);
        Saquon.addActionListener(this);
        Saquon.setBounds(325, 100, 150, 150);
        add(Saquon);

        Icon frannieIcon = new ImageIcon("src/images/Frannie.png");
        Frannie = new JButton(frannieIcon);
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

        Icon sportsIcon = new ImageIcon("src/images/footballTheme.jpg");
        sports = new JButton(sportsIcon);
        sports.addActionListener(this);
        sports.setBounds(new Rectangle(125, 400, 150, 150));
        add(sports);

        Icon mathIcon = new ImageIcon("src/images/mathTheme.jpg");
        math = new JButton(mathIcon);
        math.addActionListener(this);
        math.setBounds(new Rectangle(325, 400, 150, 150));
        add(math);

        Icon javaIcon = new ImageIcon("src/images/javatheme.jpg");
        java = new JButton(javaIcon);
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
