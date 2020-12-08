
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameOne extends JPanel implements ActionListener {

    JButton mapOne, b1;
    JLabel countdown, scoreTally;
    Timer time;
    String theme;
    String CharacterChoice;
    String ThemeChoice;
    XML_240 x2;
    ImageIcon playerIcon;
    ImageIcon themeIcon;

    int initialDelay = 1000;
    int i = 10;
    int j = 0;
    int score = 0;
    int xyMinimum = 100;
    int xyMaximum = 400;
    int buttonSizeX = 33;
    int buttonSizeY = 33;
    int endCount = 0;

    public GameOne() {
        super();
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        time = new Timer(initialDelay, this);

        x2 = new XML_240();
        //----------------------------------------------------------
        JPanel topInstructions = new JPanel();
        JLabel text = new JLabel("<html><pre><center>Welcome to PennState Erie Campus "
                + "<br/>Did you know that PennState Behrend is the only campus in PennState<br/>"
                + "to offer the Software Engineering undergraduate degree?<br/><br/>"
                + "You have 10 seconds to click the icon to earn points.  Begin!</center></pre></html>");
        text.setFont(new Font("Serif", Font.BOLD, 20));
        text.setForeground(Color.white);
        text.setOpaque(false);
        topInstructions.add(text);
        topInstructions.setBackground(Color.GRAY);
        add(topInstructions, BorderLayout.NORTH);
        //----------------------------------------------------------
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());

        //x2.openReaderXML("groupOneXML.xml");
        //ThemeChoice = (String) x2.ReadObject();
        //if ("SportsChoice".equals(ThemeChoice)) {
            themeIcon = new ImageIcon("src/images/footballTheme.jpg");
        //}
        //if ("MathChoice".equals(ThemeChoice)) {
        //    themeIcon = new ImageIcon("src/images/mathTheme.jpg");
        //}
        //if ("JavaChoice".equals(ThemeChoice)) {
        //    themeIcon = new ImageIcon("src/images/javaTheme.jpg");
        //}
        //x2.closeReaderXML();

        b1 = new JButton(themeIcon);
        b1.addActionListener(this);
        centerPanel.add(b1);
        b1.setPreferredSize(new Dimension(33, 33));
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

        scoreTally = new JLabel("Score: " + score);
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
                int y = xyMinimum + (int) (Math.random() * ((xyMaximum - xyMinimum) + 1));
                int x = xyMinimum + (int) (Math.random() * ((xyMaximum - xyMinimum) + 1));
                b1.setBounds(x, y, buttonSizeX, buttonSizeY);
                time.setDelay(initialDelay);
                countdown.setText("Time Left: " + i);
                repaint();
            } else if (object == b1) {
                score++;
                scoreTally.setText("Score: " + score);
                repaint();
                int GameOneScore = score;
                x2.openWriterXML("groupOneXML.xml");
                x2.writeObject(GameOneScore);
                x2.closeWriterXML();
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
