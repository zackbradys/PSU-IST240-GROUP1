// MainMap.java
// IST240 - Group 1 - Project Part 2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class MainMap extends JPanel implements ActionListener, KeyListener {

    JButton erie;
    JButton dubois;
    JButton wb;
    JButton hazl;
    JButton worth;
    JButton wc;
    JButton player;
    JButton back;

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

    ImageIcon mapIcon;
    ImageIcon worldIcon;
    ImageIcon saquon;
    ImageIcon frannie;
    ImageIcon lion;

    int playerX;
    int playerY;
    int gameCounter;
    int gameTime;

    String theme;

    Timer gameTimer;

    GameOne Erie;
    GameTwo Dubois;
    GameThree WB;
    GameFour Hazl;
    GameFive Worth;
    GameSix WC;
    
    Image img;

    public MainMap(String Theme) {
        super();
        setLayout(null);
        setFocusable(true);
        addKeyListener(this);
        theme = Theme;
        img = Toolkit.getDefaultToolkit().createImage("images/psmap.jpg");


        gameTimer = new Timer(1000, this);
        gameTimer.start();

        playerX = 280;
        playerY = 320;

        saquon = new ImageIcon("images/Saquon.png");
        frannie = new ImageIcon("images/Frannie.png");
        lion = new ImageIcon("images/Lion.png");

        player = new JButton();
        player.setBorderPainted(false);
        player.setContentAreaFilled(false);
        player.setRolloverEnabled(false);
        player.setBounds(new Rectangle(playerX, playerY, 50, 50));

        if (theme.equals("Saquon")) {
            player.setIcon(saquon);
            add(player);
            validate();
            repaint();
        }
        if (theme.equals("Frannie")) {
            player.setIcon(frannie);
            add(player);
            validate();
            repaint();
        }
        if (theme.equals("Lion")) {
            player.setIcon(lion);
            add(player);
            validate();
            repaint();
        }
        mapIcon = new ImageIcon("images/psmap.png");
        worldIcon = new ImageIcon("images/wc.png");
        
        erie = new JButton();
        erie.setBounds(new Rectangle(100, 100, 100, 20));
        erie.setBorderPainted(false);
        erie.setContentAreaFilled(false);
        erie.setIcon(mapIcon);
        eR = new JLabel("Erie");
        eR.setBounds(new Rectangle(100, 100, 100, 20));
        add(erie);
        add(eR);

        dubois = new JButton();
        dubois.setBounds(new Rectangle(110, 110, 100, 20));
        dubois.setBorderPainted(false);
        dubois.setContentAreaFilled(false);
        dubois.setIcon(mapIcon);
        dB = new JLabel("Dubois");
        dB.setBounds(new Rectangle(110, 110, 100, 20));
        add(dubois);
        add(dB);

        wb = new JButton();
        wb.setBounds(new Rectangle(120, 120, 100, 20));
        wb.setBorderPainted(false);
        wb.setContentAreaFilled(false);
        wb.setIcon(mapIcon);
        wB = new JLabel("Wilkes-Barre");
        wB.setBounds(new Rectangle(120, 120, 100, 20));
        add(wb);
       // add(WB);

        hazl = new JButton();
        hazl.setBounds(new Rectangle(130, 130, 100, 20));
        hazl.setBorderPainted(false);
        hazl.setContentAreaFilled(false);
        hazl.setIcon(mapIcon);
        hZ = new JLabel("Hazleton");
        hZ.setBounds(new Rectangle(130, 130, 100, 20));
        add(hazl);
        add(hZ);

        worth = new JButton();
        worth.setBounds(new Rectangle(140, 140, 100, 20));
        worth.setBorderPainted(false);
        worth.setContentAreaFilled(false);
        worth.setIcon(mapIcon);
        wT = new JLabel("Worthington");
        wT.setBounds(new Rectangle(140, 140, 100, 20));
        add(worth);
        add(wT);

        wc = new JButton();
        wc.setBounds(new Rectangle(140, 140, 100, 20));
        wc.setBorderPainted(false);
        wc.setContentAreaFilled(false);
        wc.setIcon(mapIcon);
        wC = new JLabel("World Campus");
        wC.setBounds(new Rectangle(150, 150, 100, 20));
        add(wC);
        add(wC);

        back = new JButton("Back");
        back.setBounds(new Rectangle(600, 440, 100, 40));
        back.addActionListener(this);
        add(back);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }

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
        if(key == KeyEvent.VK_LEFT) {
            if(playerX > 0) {
                playerX = playerX - 2;
                player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            }
        }
        if(key == KeyEvent.VK_RIGHT) {
            if(playerX < 574) {
                playerX = playerX + 2;
                player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            }
        }
        if(key == KeyEvent.VK_UP) {
            if(playerY > 0) {
                playerY = playerY - 2;
                player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            }
        }
        if(key == KeyEvent.VK_DOWN) {
            if(playerY > 395) {
                playerY = playerY + 2;
                player.setBounds(new Rectangle(playerX, playerY, 50, 50));
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


