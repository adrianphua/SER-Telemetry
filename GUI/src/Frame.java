
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
    
    private Circle voltsRing;
    
    private rectangle tempOverlay;
    
    private Circle mphRing;
    
    private Circle rpmRing;
    
    private StringOut mphOut;
    
    private StringOut rpmOut;
    
    private rectangle capacity;
    
    private Circle currentRing;
    
    private StringOut voltOut;
    
    private StringOut currentOut;
    
    private int volts;
    
    private int current;
    

    public Frame(String title)
    {
        super(title);

        panel = new Panel();
        
        mph = 0;
        rpm = 0;

        voltsRing = new Circle(new Point(100, 350), 225, Color.BLACK, false, "Volts");
        currentRing = new Circle(new Point(350, 350), 225, Color.BLACK, false, "Current");
        temp = new rectangle(new Point(800, 50), 100, 600, Color.RED, true, "Temperature");
        capacity = new rectangle(new Point(650, 50), 100, 600, Color.GREEN, true, "Battery Capacity");
        tempOverlay = new rectangle(new Point(800, 50), 100, 300, Color.WHITE, true, "");
        mphRing = new Circle(new Point(350, 50), 225, Color.BLACK, false, "MPH");
        rpmRing = new Circle(new Point(100, 50), 225, Color.BLACK, false, "x1000 RPM");
        
        int titleX = mphRing.getCenterX()-40;
        int titleY = mphRing.getCenterY()+20;
        
        mphOut = new StringOut(mph, titleX, titleY, null, false, "");
        
        titleX = rpmRing.getCenterX()-40;
        titleY = rpmRing.getCenterY()+20;
        
        rpmOut = new StringOut(rpm, titleX, titleY, null , false, "");
        
        titleX = voltsRing.getCenterX()-40;
        titleY = voltsRing.getCenterY()+20;
        
        voltOut = new StringOut(volts, titleX, titleY, null , false, "");
        
        titleX = currentRing.getCenterX()-40;
        titleY = currentRing.getCenterY()+20;
        
        currentOut = new StringOut(current, titleX, titleY, null , false, "");
        
        
        tempOverlay = new rectangle(new Point(800, 50), 100, 300, Color.WHITE, true, "");
        panel.addElement(temp);
        panel.addElement(tempOverlay);
        panel.addElement(capacity);
        panel.addElement(mphRing);
        panel.addElement(rpmRing);
        panel.addElement(mphOut);
        panel.addElement(rpmOut);
        panel.addElement(currentRing);
        panel.addElement(voltsRing);
        panel.addElement(voltOut);
        panel.addElement(currentOut);
        
        
        

        this.add(panel);
        setSize(1000, 800);
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
    
  //create update method so we can read in data from stream and update gui elements   
    

    public static void main(String[] args)
    {
        Frame frame = new Frame("Cart Info");
       
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);        
    }

}
