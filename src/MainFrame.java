
import java.awt.BorderLayout;
import javax.swing.*;

public class MainFrame extends JFrame {

    ControlPanel controlpanel;
    Introduction introduction;
    Instructions instructions;
    Options options;
    Credits credits;
    MainMap map;

    public MainFrame() {
        super("IST240 - Group 1 - Project Part 2");

        controlpanel = new ControlPanel();
        getContentPane().add(controlpanel, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setResizable(false);
        setVisible(true);
    }

    public void MacLayoutSetup() {
        // On some MACs it might be necessary to have the statement below
        // for the background color of the button to appear
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
