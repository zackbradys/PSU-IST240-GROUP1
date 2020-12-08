// Introduction.java
// IST240 - Group 1 Project - Part 1
// Zack Brady, Lawrence Burns, and Brett Strausser

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Introduction extends JPanel {

    JButton inst, opt, cred;
    JLabel jl1;
    Object ops;

    public Introduction() {
        super();
        setBackground(Color.gray);
        setLayout(null);

        jl1 = new JLabel("Group 1's Penn State Game");
        jl1.setBounds(new Rectangle(325, 0, 200, 50));
        add(jl1);

        inst = new JButton("Instructions");
        inst.setBounds(new Rectangle(325, 100, 200, 50));
        add(inst);

        opt = new JButton("Options");
        opt.setBounds(new Rectangle(325, 200, 200, 50));
        add(opt);

        cred = new JButton("Credits");
        cred.setBounds(new Rectangle(325, 300, 200, 50));
        add(cred);
    }
}
