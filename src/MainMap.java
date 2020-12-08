
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMap extends JPanel implements ActionListener, KeyListener, ItemListener {

    JButton player;
    JButton back;
    JButton mapOne;
    JButton b1;

    JLabel eR;
    JLabel dB;
    JLabel wB;
    JLabel hZ;
    JLabel wT;
    JLabel wC;
    JLabel eRIcon;
    JLabel dBIcon;
    JLabel wBIcon;
    JLabel hZIcon;
    JLabel wTIcon;
    JLabel wCIcon;
    JLabel countdown;
    JLabel scoreTally;

    ImageIcon mapIcon;
    ImageIcon worldIcon;
    ImageIcon saquon;
    ImageIcon frannie;
    ImageIcon lion;
    ImageIcon playerIcon;

    Image img;

    static int playerX;
    static int playerY;

    int gameCounter;
    int gameTime;
    int initialDelay = 1000;
    int i = 10;
    int j = 0;
    int score = 0;
    int xyMinimum = 100;
    int xyMaximum = 400;
    int buttonSizeX = 33;
    int buttonSizeY = 33;
    int endCount = 0;

    String theme;
    String CharacterChoice;
    String ThemeChoice;

    Timer time;
    Timer gameTimer;

    GameOne ER;
    GameTwo DB;
    GameThree WB;
    GameFour HZ;
    GameFive WT;
    GameSix WC;

    XML_240 x2;

    JPanel centerPanel;
    JPanel southButton;
//--------------------------------------------

    public MainMap() {
        super();
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        x2 = new XML_240();
        ER = new GameOne();
        DB = new GameTwo();
        WB = new GameThree();
        HZ = new GameFour();
        WT = new GameFive();
        WC = new GameSix();
        
//-----------CENTER PANEL---------------------
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        ImageIcon img = new ImageIcon("src/images/psmap.jpg");
        JLabel imgLabel = new JLabel("", img, JLabel.CENTER);
        centerPanel.add(imgLabel, BorderLayout.CENTER);
        
        eR = new JLabel(new ImageIcon("src/images/erie.jpg"));
        eR.setBounds(new Rectangle(160, 168, 100, 25));
        add(eR);

        dB = new JLabel(new ImageIcon("src/images/dubois.jpg"));
        dB.setBounds(new Rectangle(250, 272, 100, 25));
        add(dB);

        wB = new JLabel(new ImageIcon("src/images/wilkesbarre.jpg"));
        wB.setBounds(new Rectangle(420, 240, 100, 25));
        add(wB);

        hZ = new JLabel(new ImageIcon("src/images/hazleton.jpg"));
        hZ.setBounds(new Rectangle(430, 280, 100, 25));
        add(hZ);

        wT = new JLabel(new ImageIcon("src/images/worthington.jpg"));
        wT.setBounds(new Rectangle(530, 240, 100, 25));
        add(wT);

        wC = new JLabel(new ImageIcon("src/images/worldcampus.jpg"));
        wC.setBounds(new Rectangle(320, 310, 100, 25));
        add(wC);

        //------------Beggining of XML icon/theme chooser---------
        //x2.openReaderXML("groupOneXML.xml");
        //CharacterChoice = (String) x2.ReadObject();
        //ThemeChoice = (String) x2.ReadObject();
        
        //x2.closeReaderXML();
        
        //if ("LionChoice".equals(CharacterChoice)) {
            playerIcon = new ImageIcon("src/images/Lion.png");
        //}
        //if ("SaquonChoice".equals(CharacterChoice)) {
        //    playerIcon = new ImageIcon("src/images/Saquon.png");
        //}
        //if ("FrannieChoice".equals(CharacterChoice)) {
        //    playerIcon = new ImageIcon("src/images/Frannie.png");
        //}
        //-----------End of XML icon/theme chooser---------------
        
        playerX = 150;
        playerY = 300;
        player = new JButton(CharacterChoice);
        player.setBorderPainted(false);
        player.setContentAreaFilled(false);
        player.setRolloverEnabled(false);
        player.setBounds(playerX, playerY, 50, 50);
        player.setIcon(playerIcon);
        add(player);
        player.addKeyListener(this);
        player.setFocusable(true);

        centerPanel.setBackground(Color.GRAY);
        add(centerPanel, BorderLayout.CENTER);

//-----------SOUTH PANEL------------------------
        southButton = new JPanel();
        //time.start();
        countdown = new JLabel("Time Elapsed: " + i);
        countdown.setFont(new Font("Serif", Font.BOLD, 20));
        countdown.setForeground(Color.white);
        countdown.setOpaque(false);
        southButton.add(countdown);

        back = new JButton("Return to Map Screen");
        back.setBackground(Color.blue);
        back.setForeground(Color.white);
        back.setFont(new Font("Serif", Font.BOLD, 20));
        back.setFocusPainted(false);
        southButton.add(back);
        southButton.setBackground(Color.GRAY);

        scoreTally = new JLabel("Score: " + score);
        scoreTally.setFont(new Font("Serif", Font.BOLD, 20));
        scoreTally.setForeground(Color.white);
        scoreTally.setOpaque(false);
        southButton.add(scoreTally);
        add(southButton, BorderLayout.SOUTH);
    }
//-------------OVERRIDES---------------------

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            playerX = playerX - 2;
            player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            validate();
            repaint();
        }
        if (key == KeyEvent.VK_RIGHT) {
            playerX = playerX + 2;
            player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            validate();
            repaint();
        }
        if (key == KeyEvent.VK_UP) {
            playerY = playerY - 2;
            player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            validate();
            repaint();
        }
        if (key == KeyEvent.VK_DOWN) {
            playerY = playerY + 2;
            player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            validate();
            repaint();
        }
        if (player.getBounds().x == eR.getX() && player.getBounds().y == eR.getY()) {
            centerPanel.removeAll();
            southButton.removeAll();
            add(ER);
            validate();
            repaint();
        }
        if (player.getBounds().x == dB.getX() && player.getBounds().y == dB.getY()) {
            centerPanel.removeAll();
            southButton.removeAll();
            add(DB);
            validate();
            repaint();
        }
        if (player.getBounds().x == wB.getX() && player.getBounds().y == wB.getY()) {
            centerPanel.removeAll();
            southButton.removeAll();
            add(WB);
            validate();
            repaint();
        }
        if (player.getBounds().x == hZ.getX() && player.getBounds().y == hZ.getY()) {
            centerPanel.removeAll();
            southButton.removeAll();
            add(HZ);
            validate();
            repaint();
        }
        if (player.getBounds().x == wT.getX() && player.getBounds().y == wT.getY()) {
            centerPanel.removeAll();
            southButton.removeAll();
            add(WT);
            validate();
            repaint();
        }
        if (player.getBounds().x == wC.getX() && player.getBounds().y == wC.getY()) {
            centerPanel.removeAll();
            southButton.removeAll();
            add(WC);
            validate();
            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
        }
        if (key == KeyEvent.VK_SPACE) {
        }
        if (key == KeyEvent.VK_RIGHT) {
        }
        if (key == KeyEvent.VK_UP) {
        }
        if (key == KeyEvent.VK_DOWN) {
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
