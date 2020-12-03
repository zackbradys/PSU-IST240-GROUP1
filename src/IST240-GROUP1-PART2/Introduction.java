// Introduction.java
// IST240 - Group 1 - Project Part 1

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Introduction extends JPanel {

    JButton inst, opt, map, score, cred;
    JLabel jl1;
    Object ops;
    
    public Introduction() {
        super();
        setBackground(Color.gray);
        setLayout(null);

        jl1 = new JLabel("IST 240 - Group 1 - Penn State Game");
        jl1.setBounds(new Rectangle(325, 0, 200, 50));
        add(jl1);

        inst = new JButton("INSTRUCTIONS");
        inst.setBounds(new Rectangle(300, 100, 200, 50));
        add(inst);

        opt = new JButton("OPTIONS");
        opt.setBounds(new Rectangle(300, 200, 200, 50));
        add(opt);

        map = new JButton("START GAME");
        map.setBounds(new Rectangle(300, 300, 200, 50));
        add(map);
        
        cred = new JButton("CREDITS");
        cred.setBounds(new Rectangle(300, 400, 200, 50));
        add(cred);

    }
}
