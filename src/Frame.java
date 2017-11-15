
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

        this.add(panel);

        // finish setting up the frame
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Frame frame = new Frame("The Batman");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
