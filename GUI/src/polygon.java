import java.awt.Color;
import java.awt.Graphics;

public abstract class polygon extends Element
{

    public polygon(Color color, boolean filled)
    {
        super(color, filled);
    }

    @Override
    public void draw(Graphics graphics)
    {
        int numOfPoints = location.length;

        int[] xPoints = new int[numOfPoints];
        int[] yPoints = new int[numOfPoints];
        

        for (int i = 0; i < numOfPoints; i++)
        {
            xPoints[i] = location[i].x;
            yPoints[i] = location[i].y;
        }
        

        graphics.setColor(this.getColor());
        

        if (this.isFilled())
        {
            graphics.fillPolygon(xPoints, yPoints, numOfPoints);
        } 
        else
        {
            graphics.drawPolygon(xPoints, yPoints, numOfPoints);
        }
    }
}
