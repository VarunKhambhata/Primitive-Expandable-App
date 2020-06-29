package bin;
import javax.swing.JLabel;
import java.awt.Color;

public class Element extends JLabel
{    
    Element(Color c, int x, int y)
    {
        super();
        setOpaque(true);
        setBackground(c);
        setLocation(x,y);
        setSize(50,50);
    }
  

}