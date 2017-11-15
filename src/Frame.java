
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
