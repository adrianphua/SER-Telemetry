
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
        
        int mph = 0;
        int rpm = 0;
        
        String mphString ="mph";
        String rpmString ="x1000 rpm";
        
        //Add a white rectangle on top of temp rectangle and have the bottom shrink to the top
        rectangle temp = new rectangle(new Point(800, 50), 100, 400, Color.RED, true);
        
        rectangle tempOverlay = new rectangle(new Point(800, 50), 100, 300, Color.WHITE, true);
        rectangle volts = new rectangle(new Point(650, 50), 100, 400, Color.GREEN, true);
        
        Circle mphRing = new Circle(new Point(350, 50), 225, Color.BLACK, false);
        Circle rpmRing = new Circle(new Point(100, 50), 225, Color.BLACK, false);
        
        StringOut mphOut = new StringOut(mphString, mph, 450, 180, null, false);
        StringOut rpmOut = new StringOut(rpmString, rpm, 180, 180, null , false);
        
        
        tempOverlay = new rectangle(new Point(800, 50), 100, 300, Color.WHITE, true);
        panel.addElement(temp);
        panel.addElement(tempOverlay);
        panel.addElement(volts);
        panel.addElement(mphRing);
        panel.addElement(rpmRing);
        panel.addElement(mphOut);
        panel.addElement(rpmOut);
        
        
        

        this.add(panel);
        setSize(1000, 600);
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
