// ControlPanel.java
// IST240 - Group 1 - Project

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlPanel extends JPanel implements ActionListener {

    Introduction intro;
    Instructions ins;
    Options ops;
    Credits creds;

    public ControlPanel() {
        super();
        setLayout(new GridLayout(1, 1));
        setBackground(Color.gray);
        
        intro = new Introduction();
        intro.inst.addActionListener(this);
        intro.opt.addActionListener(this);
        intro.cred.addActionListener(this);
        
        ins = new Instructions();
        ins.insB.addActionListener(this);
        
        ops = new Options();
        ops.opsB.addActionListener(this);
        
        creds = new Credits();
        creds.credB.addActionListener(this);
        
        add(intro);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == intro.inst) {
            remove(intro);
            add(ins);
            validate();
            repaint();
        }
        if(obj == ins.insB) {
            remove(ins);
            add(intro);
            validate();
            repaint();
        }
        if(obj == intro.cred) {
            remove(intro);
            add(creds);
            validate();
            repaint();
        }
        if(obj == creds.credB) {
            remove(creds);
            add(intro);
            validate();
            repaint();
        }
        if(obj == intro.opt) {
            remove(intro);
            add(ops);
            validate();
            repaint();
        }
        if(obj == ops.opsB) {
            remove(ops);
            add(intro);
            validate();
            repaint();
        }
}
}
