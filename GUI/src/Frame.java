
import java.awt.Color;
import java.util.Scanner;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame extends JFrame
{

    private int mph;
    
    private int rpm;
    
    private static Panel panel;
    
    private rectangle temp;
    
    private rectangle volts;
    
    private rectangle tempOverlay;
    
    private Circle mphRing;
    
    private Circle rpmRing;
    
    private StringOut mphOut;
    
    private StringOut rpmOut;

    public Frame(String title)
    {
        super(title);

        panel = new Panel();
        
        mph = 0;
        rpm = 0;

        
    
        temp = new rectangle(new Point(800, 50), 100, 400, Color.RED, true, "Temperature");
        volts = new rectangle(new Point(650, 50), 100, 400, Color.GREEN, true, "Battery Capacity");
        tempOverlay = new rectangle(new Point(800, 50), 100, 300, Color.WHITE, true, "");
        mphRing = new Circle(new Point(350, 50), 225, Color.BLACK, false, "MPH");
        rpmRing = new Circle(new Point(100, 50), 225, Color.BLACK, false, "x1000 RPM");
        
        int titleX = mphRing.getCenterX()-10;
        int titleY = mphRing.getCenterY()+20;
        
        mphOut = new StringOut(mph, titleX, titleY, null, false, "");
        
        titleX = rpmRing.getCenterX()-10;
        titleY = rpmRing.getCenterY()+20;
        
        rpmOut = new StringOut(rpm, titleX, titleY, null , false, "");
        
        
        tempOverlay = new rectangle(new Point(800, 50), 100, 300, Color.WHITE, true, "");
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
    public void setMPH(int mph)
    {
        this.mph = mph;
    }
    
    public void setRPM(int rpm)
    {
        this.rpm = rpm;
    }
    
    public void update()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter mph");
        setMPH(keyboard.nextInt());
        System.out.println("mph is now: " + mph);
        
        int titleX = mphRing.getCenterX()-10;
        int titleY = mphRing.getCenterY()+20;
        mphOut = new StringOut(mph, titleX, titleY, null, false, "");
        this.repaint();
        
        
    }
    
    

    public static void main(String[] args)
    {
        Frame frame = new Frame("Cart Info");
        while(0 != 1)
        {
            frame.update();
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
    }

}
