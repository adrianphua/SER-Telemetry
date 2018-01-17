import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Element
{
    private int diameter1;
    private int diameter2;
    String title;

    public Oval(Point pointUL, int diameter1, int diameter2, Color color, boolean filled, String title)
    {
       
        super(color, filled, title);
        location = new Point[1];
        location[0] = pointUL;
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
        this.title = title;

    }

    public int getDiameter1()
    {
        return diameter1;
    }

    public int getDiameter2()
    {
        return diameter2;
    }
    public int getCenterX()
    {
        return (diameter1/2) + location[0].x;
    }
    
    public int getCenterY()
    {
        return (location[0].y + (diameter2/2));
    }

    @Override
    public void draw(Graphics graphics)
    {

        graphics.setColor(this.getColor());
        graphics.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        
        int titleX = (diameter1/2) + location[0].x - 5;
        int titleY = (location[0].y + diameter2) + 20;
        
        graphics.drawString(title, titleX, titleY);
       
        if (super.isFilled())
        {
            graphics.fillOval(location[0].x, location[0].y, diameter1, diameter2);
        }
        else
        {
            graphics.drawOval(location[0].x, location[0].y, diameter1, diameter2);
        }

    }
}
