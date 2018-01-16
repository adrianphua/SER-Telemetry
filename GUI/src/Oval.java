import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Element
{
    private int diameter1;
    private int diameter2;

    public Oval(Point pointUL, int diameter1, int diameter2, Color color, boolean filled)
    {
       
        super(color, filled);
        location = new Point[1];
        location[0] = pointUL;
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;

    }

    public int getDiameter1()
    {
        return diameter1;
    }

    public int getDiameter2()
    {
        return diameter2;
    }

    @Override
    public void draw(Graphics graphics)
    {

        graphics.setColor(this.getColor());
       
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
