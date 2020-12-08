
import javax.swing.*;
import java.awt.*;

public class GameOver extends JPanel {

    JLabel gO1;
    JLabel gO2;
    JLabel gO3;
    JLabel time1;
    XML_240 x2;

    int time2;
    int GameOneScore;
    int GameTwoScore;
    int GameThreeScore;
    int GameFourScore;
    int GameFiveScore;
    int GameSixScore;
    int totalScore;

    JButton reset;

    public GameOver() {
        super();
        setLayout(null);

        x2.openReaderXML("groupOneXML.xml");
        GameOneScore = (int) x2.ReadObject();
        GameTwoScore = (int) x2.ReadObject();
        GameThreeScore = (int) x2.ReadObject();
        GameFourScore = (int) x2.ReadObject();
        GameFiveScore = (int) x2.ReadObject();
        GameSixScore = (int) x2.ReadObject();
        totalScore = GameOneScore + GameTwoScore + GameThreeScore + GameFourScore + GameFiveScore + GameSixScore;
        x2.closeReaderXML();

        gO1 = new JLabel("Game Over!");
        gO1.setBounds(new Rectangle(270, 160, 100, 25));
        add(gO1);

        gO2 = new JLabel("You have finished every game!");
        gO2.setBounds(new Rectangle(160, 200, 400, 25));
        add(gO2);

        gO3 = new JLabel("Your total score is: " + totalScore);
        gO3.setBounds((new Rectangle(10, 20, 30, 40)));         //THESE COORDS AND SIZE MUST BE CHANGED
        add(gO3);

        reset = new JButton("Play Again?");
        reset.setBounds(new Rectangle(270, 300, 100, 40));
        add(reset);
    }

    public void receivedTime(int informedTime) {
        time2 = informedTime;
        time1 = new JLabel("Your total play time was: " + time2 + " seconds");
        time1.setBounds(new Rectangle(250, 245, 400, 25));
        add(time1);
    }
}
