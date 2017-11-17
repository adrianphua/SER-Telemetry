
import java.awt.Color;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame
{
    private static Panel panel;

    public Frame(String title)
    {
        super(title);

        panel = new Panel();
        
        
        rectangle temp = new rectangle(new Point(600, 50), 100, 400, Color.GRAY, false);
        rectangle volts = new rectangle(new Point(450, 50), 100, 400, Color.GRAY, false);
        
        panel.addElement(temp);
        panel.addElement(volts);
        

        this.add(panel);
        setSize(800, 600);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Frame frame = new Frame("Cart Info");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
