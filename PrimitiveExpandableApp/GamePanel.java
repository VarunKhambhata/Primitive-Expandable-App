package bin;
import java.awt.Color;
import javax.swing.JPanel;


public class GamePanel extends JPanel
{
    public Element RED, GREEN, BLUE, BLACK;  
    
    public GamePanel()
    {
        super();
        RED = new Element(Color.RED, 10,10);
        GREEN = new Element(Color.GREEN, 540,10);
        BLUE = new Element(Color.BLUE, 10,140);
        BLACK = new Element(Color.BLACK, 540,140);

        add(RED);
        add(GREEN);
        add(BLUE);
        add(BLACK);
    }  
}